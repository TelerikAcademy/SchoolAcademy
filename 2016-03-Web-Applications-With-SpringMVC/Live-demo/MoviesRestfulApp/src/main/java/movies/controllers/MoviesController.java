package movies.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import movies.models.Movie;
import movies.utils.IdGenerator;

@RestController
@RequestMapping("/api")
public class MoviesController {
	private final static int PAGE_SIZE = 10;
	List<Movie> movies;
	IdGenerator idGenerator;
	
	public MoviesController() throws Exception{
		this.movies = new ArrayList<Movie>();
		this.idGenerator = new IdGenerator();
		
		int count = 1000;
		
		for(int i = 0; i < count; i++){
			Movie movie = new Movie();
			
			movie.setId(this.idGenerator.getNextId());
			movie.setTitle("Movie #" + (i+1));
			movie.setDescription("Description for movie #" + (i+1));
			movie.setRating(1);
			movie.setVotesCount(0);
			
			movies.add(movie);
		}
	}

//GET /api/movies?page=2 -> all movies
//	@RequestMapping("/movies")
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public List<Movie> getAll(@RequestParam(value="page", defaultValue="0") Integer page,
				String pattern) throws Exception{

		page = (page == null || page < 1)
				? 1
				: page;
		
		final String thePattern = (pattern == null
					? "" 
					: pattern).toLowerCase();
		
		System.out.printf("Pattern: %s%n", pattern);
		
		return this.movies
				.stream()
				.filter(movie -> movie.getTitle().toLowerCase()
							.contains(thePattern))
				.collect(Collectors.toList())
				.subList((page - 1) * PAGE_SIZE, page * PAGE_SIZE);
	}

	//POST /api/movies  -> create new movie
	@RequestMapping(value="/movies", method=RequestMethod.POST)
	public Movie addMovie(@RequestBody Movie newMovie) throws Exception{
		newMovie.setId(this.idGenerator.getNextId());
		newMovie.setRating(1);
		newMovie.setVotesCount(0);
		this.movies.add(newMovie);
		return newMovie;
	}

	//GET /api/movies/MOVIE_ID -> detailed info about movie
	@RequestMapping(value="/movies/{movieId}", method=RequestMethod.GET)
	public Movie getById(@PathVariable(value="movieId") int id) throws NoSuchRequestHandlingMethodException{
		for(Movie currentMovie : this.movies){
			if(currentMovie.getId() == id) {
				return currentMovie;
			}
		}

        throw new NoSuchRequestHandlingMethodException("Not found such movie", Movie.class);
	}

	//PUT /api/movies/MOVIE_ID   -> vote for movie
	
	@RequestMapping(value="/movies/{movieId}", 
				method=RequestMethod.PUT)
	public Movie voteForMovie(@PathVariable(value="movieId") int id,
							@RequestBody int rating) throws Exception{
		Movie movie = this.getById(id);

		double oldRatingsSum = movie.getRating() * movie.getVotesCount();

		int newVotesCount = movie.getVotesCount() + 1;
		
		double newRating = (oldRatingsSum + rating)/newVotesCount;
		
		movie.setRating(newRating);
		
		movie.setVotesCount(newVotesCount);
		return movie;
	}

	@RequestMapping(value="/movies/{movieId}", 
				method=RequestMethod.DELETE)
	public boolean deleteMovieById(@PathVariable(value="movieId") int id) throws Exception{

		int index = -1;
		for(int i = 0, len = this.movies.size(); i < len; i ++){
			Movie movie = this.movies.get(i);
			if(movie.getId() == id){
				index = i;
				break;
			}
		}
		
		if(index < 0){
	       throw new NoSuchRequestHandlingMethodException("Not found such movie", Movie.class);		
		}

		this.movies.remove(index);
		return true;
	}
	
	
	
}
