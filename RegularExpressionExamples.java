package javaLearningsRegEx;

public class RegularExpressionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "regu regular Exp examples";
		System.out.println(a.replaceAll(".", "d"));
		System.out.println(a.replaceAll("^regu", "d")); //----Beginning of the string or line ^ represents begining of line or string
		System.out.println(a.replaceAll("^gu", "any"));	//---Doesnt replace any
		System.out.println(a.replaceAll("regu", "d"));
		System.out.println(a.replaceAll("gu", "end"));
		System.out.println(a.replaceAll("[re]", "tf"));//---Replaces both letters r and e
		System.out.println(a.replaceAll("re", "tf"));	//---Replaces only re
		System.out.println(a.replaceAll("e", "ee"));
		System.out.println(a.replaceAll("[eE]", "ee"));
		System.out.println(a.replaceAll("[^eE ]", "!"));
		String alphanumeric = "Every Tom, Dick, Harry, Barry & Jerry 28272!!";
		System.out.println(alphanumeric.replaceAll("(?i)[a-h]", "YY"));		//(?i)Ignores Case Sensitivity
		System.out.println(alphanumeric.replaceAll("[0-9]", "no"));
		System.out.println(alphanumeric.replaceAll("(?i)[^a-z0-9]", "no")); //Ignores A-Z,a-z,0-9 and rplacess all remaining
		System.out.println(alphanumeric.replaceAll("\\d", "no"));	//Replaces digits
		System.out.println(alphanumeric.replaceAll("\\D", "no"));	//Replaces all except digits
		System.out.println(alphanumeric.replaceAll("\\s", ""));	//Replaces Whitespaces
		System.out.println(alphanumeric.replaceAll("\\S", "d"));	//Ignores Whitespaces
		System.out.println(alphanumeric.replaceAll("\\w", "w"));	//Ignores Whitespaces and special characters
		System.out.println(alphanumeric.replaceAll("\\W", "w"));	//Replaces whitespaces and special characters
		System.out.println(alphanumeric.replaceAll("\\B", "-"));	//Replaces between two characters
		System.out.println(alphanumeric.replaceAll("\\b", "<"));	//Surrounds every word
	}

}
