package arif;

public class Arrays {

	public static void main(String[] args) {

	/*			int a = 10;
		int b = 20;
		int c = 30;
		int d , e , f;
		d = 40; e = 50;  f = 60;

		                                                 		
			int a1 = 10;
		int b1 = 20;
		 

		//int a[] = a[0],  a[1],  a[2],  a[3],  a[4];
*/
		int[] a = {10,20,30,40,50};
		System.out.println(a[2]  + " " + a[4]);

		//enhance for
		for(int temp : a) {
			System.out.println(temp);
		} 

		System.out.println("<-------------------------------->");
		int[] x = new int[4];

		x[0] = 222;
		x[3] = 333;

		for(int temp2 : x) {
			System.out.println(temp2);
		}

	


	}
}

