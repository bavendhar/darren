package sunday;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practise {
	
	
	public String name() {
		return "bavendhar";
		
	}
	
	public int height() {
		return 175;
		
	}
	
	public int weight() {
		return 96;
		
	}
	
	public int age() {
		return 25;
	}
	

	public static void main(String[] args) {
		
		Practise obj=new Practise();
		String name=obj.name();
		System.out.println(name);
		
		
		Practise obj2=new Practise();
		int height=obj2.height();
		System.out.println(height);
		
		
		Practise obj3=new Practise();
		int weight=obj3.weight();
		System.out.println(weight);
		
		
		Practise obj4=new Practise();
		int age=obj4.age();
		System.out.println(age);
		
		

	}

}
