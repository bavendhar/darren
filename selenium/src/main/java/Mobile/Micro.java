package Mobile;

public class Micro {

	public int display() {
		return 7200;
	}
	
	public String type() {
		return "led";
	}
	
	public String size() {
		return "inches";
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Micro obj2 = new Micro();
		String size = obj2.size();
		System.out.println(size);
		
		
		//create object
		Micro obj=new Micro();
		int display = obj.display();
	    System.out.println(display);
	    obj.display();
	    
	    Micro obj1=new Micro();
		String type = obj1.type();
	    System.out.println(type);
	    obj1.type();	



		
		
		 		
		
		
		
		
	
	}

}
