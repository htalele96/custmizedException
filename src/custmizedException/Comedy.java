package custmizedException;

public class Comedy {
	
	public String telljoke(boolean isLaughing) throws FunnyException {
		if (isLaughing) {
			return "New Joke";
		}else {
			throw new FunnyException("Sanket ch pancht joke");
			 
		}
	}
}
