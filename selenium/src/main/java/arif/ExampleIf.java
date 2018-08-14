package arif;

public class ExampleIf {

	public static void main(String[] args) {

		int x = 20;
		int y = 20;

		if(x<y) {
			System.out.println("x is lesser than y");
		}

		else if(x == y) {
			System.out.println("x is equal to y");
		}else{
			System.out.println("x is greater than y");
		}
	}
}