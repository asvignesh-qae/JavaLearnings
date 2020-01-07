package javaLearningsRegEx;

public class RegularExpressionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "regu regular Exp examples";
		System.out.println(a.replaceAll(".", "d"));
		System.out.println(a.replaceAll("^regu", "d")); //----Beginning of the string or line ^ represents beginning of line or string
		System.out.println(a.replaceAll("^gu", "any"));	//---Doesn't replace any
		System.out.println(a.replaceAll("regu", "d"));
		System.out.println(a.replaceAll("gu", "end"));
		System.out.println(a.replaceAll("[re]", "tf"));//---Replaces both letters r and e
		System.out.println(a.replaceAll("re", "tf"));	//---Replaces only re
		System.out.println(a.replaceAll("e", "ee"));
		System.out.println(a.replaceAll("[eE]", "ee"));
		System.out.println(a.replaceAll("[^eE ]", "!"));
		String alphanumeric = "Every Tom, Dick, Harry, Barry & Jerry 28272!!";
		System.out.println(alphanumeric.replaceAll("(?i)[a-h]", "YY"));		//(?i)Ignores Case Sensitivity
		System.out.println("Digits replace "+alphanumeric.replaceAll("[0-9]", "no"));
		System.out.println(alphanumeric.replaceAll("(?i)[^a-z0-9]", "no")); //Ignores A-Z,a-z,0-9 and replaces all remaining
		System.out.println("All digits gone "+alphanumeric.replaceAll("\\d", "no"));	//Replaces digits
		System.out.println("All digits retained "+alphanumeric.replaceAll("\\D", "no"));	//Replaces all except digits
		System.out.println("Spaces removed "+alphanumeric.replaceAll("\\s", ""));	//Replaces Whitespace
		System.out.println("Spaces retained "+alphanumeric.replaceAll("\\S", "d"));	//Ignores Whitespace
		System.out.println(alphanumeric.replaceAll("\\w", "w"));	//Ignores Whitespace and special characters
		System.out.println(alphanumeric.replaceAll("\\W", "w"));	//Replaces whitespace and special characters
		System.out.println(alphanumeric.replaceAll("\\B", "-"));	//Replaces between two characters
		System.out.println(alphanumeric.replaceAll("\\b", "<"));	//Surrounds every word
		
		//Quantifiers
		System.out.println(alphanumeric.replaceAll("[rry]", ""));
		String st = "newaaaadssss234tttff!!newaaaartt4ds)&!!";
		System.out.println(st.replaceAll("newa{4}", "_"));
		System.out.println(st.replaceAll("^newa{4}", "_"));	//Replaces only at the beginning of the line
		System.out.println(st.replaceAll("newa+", "_"));	//+denotes atleast 1 occurrence
		System.out.println(st.replaceAll("newav+", "_"));	//Nothing is replaced here
		System.out.println(st.replaceAll("newav*", "_"));	//Here newav is not present but newa is still replaced * checks 0 or more
		System.out.println(st.replaceAll("newa{2,6}", "_"));	//Specify the range of character a from 2 to 6 times
		System.out.println(st.replaceAll("newa{5,7}", "_"));	//None changed as checks for character a repeated min 5 times
		System.out.println(st.replaceAll("t+f*!", "_"));
		System.out.println(st.replaceAll("t+f*!+", "_"));
	}

}
