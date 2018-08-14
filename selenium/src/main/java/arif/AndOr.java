package arif;

public class AndOr {

	public static void main(String[] args) {

		int x,y;
		x = 10;
		y = -10;

		// $$ and
		// || or
		
		if(x > 0 && y > 0) {
			System.out.println("both the num us +ve");

		}else if(x > 0 || x > 0) {
			System.out.println("atleast one num is +ve");

		}else {
			System.out.println("both num is -ve");
		}

	}

}
