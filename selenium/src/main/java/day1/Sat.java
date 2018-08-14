package day1;

public class Sat {
	
	public String name() {
		return "bavendhar";
	}
	
	public int age() {
		return 25;
	}
	
	public String qualification() {
		return "be";
		
	}
	
	
	

	public static void main(String[] args) {
		
		Sat obj =new Sat();
		String name = obj.name();
		System.out.println(name);
		
		
		Sat obj1 = new Sat();
		int age = obj1.age();
		System.out.println(age);
		
		Sat obj3 = new Sat();
		String qualification = obj3.qualification();
		System.out.println(qualification);
		
		
		

	}

}
