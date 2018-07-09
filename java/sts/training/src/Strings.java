
public class Strings {
	
	public static void main(String[] args) {
		char letter = 'a';
		
		String string1 = "Hello";
		String string2 = "World";
		String string3 = "";
		
		String dontDoThis = new String("Bad Practice"); // String literals are also String objects
		/**
		 * Using new keyword simple creates another instance functionally identical to the literal.
		 * If used inside a loop it will result in needless String instances created.
		 */
		
		string3 = string1 + string2; // Concatenate strings
		
		System.out.println("Output: " + string3 + " " + letter);
		
	}

}
