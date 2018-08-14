package learnstringandcollection;

public class LearnString {
	
	public static void main(String[] args){
		
		String bav = new String("hello world");
		
		
		//length find the number of character
		int length =bav.length();
		System.out.println(length);
		
		//tochararray
		 char[] charArray = bav.toCharArray();
		 for (char c : charArray) {
			System.out.println(c);
		}
		//character at
		System.out.println(bav.charAt(6));
		
		//index of
		System.out.println(bav.indexOf("e"));
		
		//concat
		String kutty="hai";
		System.out.println(bav.concat(kutty));
		
		//substring
		System.out.println(bav.substring(0, 7));
		
		//trim
		System.out.println(bav.trim());
		
		//split
		String darren="apple,orange,banana";
		String[] split = darren.split(",");
		for (String string : split) {
			System.out.println(string);
		}
		
		//StartsWith EndsWith ContainsWith
		for (String string : split) {
			if(string.startsWith("a")) {
				System.out.println(string);
			}
			if(string.endsWith("e")) {
				System.out.println(string);
			}
			if(string.contains("n")) {
				System.out.println(string);
			}
		}
		
		//replace
		//System.out.println(bav.replace('h','a'));
		
		
	}
	

}
