package arif;

public class String {

	public static void main(java.lang.String[] args) {
		
		java.lang.String x = "Arif Muhammad";
		
		System.out.println("Hello " + x );
		
        System.out.println(x.toUpperCase());
        
        System.out.println(x.substring(1));
        
        System.out.println(x.substring(1,11));
		
        System.out.println(x.charAt(5));
        
        //wrapper classes
        
        java.lang.String age = "25";
        java.lang.String salary = "25000.79";
        
        int a =Integer.parseInt(age)/2;
        System.out.println(a);
        
        double s = Double.parseDouble(salary) *25;
        System.out.println(s);
        
        
        
	}

}
