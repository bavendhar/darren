package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listfunction {

	public static void main(String[] args) {
		
		List<Integer> bagprice =new ArrayList<Integer>();
		bagprice.add(999);
		bagprice.add(666);
		bagprice.add(545);
		bagprice.add(545);
		bagprice.add(545);
		bagprice.add(654);
		bagprice.add(666);
		bagprice.add(999);
		bagprice.add(666);
		
		Integer max = Collections.max(bagprice);
		
		
			System.out.println(max);
		}

}
	