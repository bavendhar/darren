package learnstringandcollection;

import java.util.ArrayList;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {
		
		List<String> bagname=new ArrayList<String>();
		
		bagname.add("american");
		bagname.add("puma");
		bagname.add("sky");
		bagname.add("reebook");
		
		System.out.println(bagname.size());
		
		System.out.println(bagname.get(2));
		
		System.out.println(bagname);
		
		System.out.println(bagname.contains("sk"));
		
		
		
	}
}
