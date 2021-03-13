package custmizedException;

public class TestFunnyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy comedy=new Comedy();
		try {
			comedy.telljoke(false);
		} catch (FunnyException f) {
			f.printStackTrace();
		}
	}

}
