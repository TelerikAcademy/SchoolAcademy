package movies.models;

import org.w3c.dom.ranges.RangeException;

public class Movie {
	private int id;
	
	private String title;
	
	private String description;
	
	private int votesCount;
	
	private double rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVotesCount() {
		return votesCount;
	}

	public void setVotesCount(int votesCount) {
		this.votesCount = votesCount;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) throws Exception{
		if(rating < 1 || rating > 5){
			throw new Exception();
		}
		
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
