package Strings;

public class IntroductionToStrings {

	public static void main(String[] args) {
		String str1= "Hi,";
		String str2= "I Hope this message finds you well.";
		System.out.println(str1.length()); //finds the length of the string
		System.out.println(str2.charAt(0)); //find the character at an index
//		System.out.println(str1+str2); //concatenate two strings
//		str1+=str2;
//		System.out.println(str1); //another way of concatenation
		str1= str1.concat(str2);
		System.out.println(str1); //yet another way of concatenation
		System.out.println(str1.equals(str2)); //comparison
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b)); //gives the difference in the lengths of the strings.
		String str3= str2.substring(2); //provides the substring from an index onwards.
		String str4= str2.substring(2,12); //provides the substring from an index up to an index where last index is exclusive.
		System.out.println(str3); 
		System.out.println(str4); 
		
		
		
		
	}

}
