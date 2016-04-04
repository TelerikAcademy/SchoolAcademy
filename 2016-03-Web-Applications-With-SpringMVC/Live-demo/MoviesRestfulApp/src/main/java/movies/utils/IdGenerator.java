package movies.utils;

public class IdGenerator {
	private int lastId;
	
	public IdGenerator(){
		this.lastId = 0;
	}
	
	public int getNextId(){
		return ++this.lastId;
	}
}
