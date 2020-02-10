package javaLearningsRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		//Pattern Matchers
		String html1 = "<h2> Practice regular expressions </h2>";
		html1= html1+"<P> This is first paragraph </p>";
		html1= html1+"<P> This is Second paragraph </p>";
		html1= html1+"<b> This is bold text </b>";
		html1= html1+"<h2> This is Second heading </h2>";
		//System.out.println("html1 is "+html1);
		String pat = ".*<h2>.*";
		Pattern patMat = Pattern.compile(pat);
		Matcher mt = patMat.matcher(html1);
		System.out.println(mt.matches());
		int count =0;
		String patGrp = "<h2>";
		Pattern p = Pattern.compile(patGrp);
		Matcher m = p.matcher(html1);
		while(m.find()) {
			count++;
			System.out.println("Occourance: "+count+ " Start index is "+m.start()+" end index is "+m.end());
			System.out.println(html1.substring(m.start(), m.end()));
		}
		
		//Groups
		String ptGrp1 = "(<h2>)";
		Pattern pt = Pattern.compile(ptGrp1);
		Matcher mr = pt.matcher(html1);
		while(mr.find()) {
			System.out.println("Group h2 is "+mr.group(1));	
		}
		
		String ptGrp2 = "(<h2>.*</h2>)";
		Pattern pt1 = Pattern.compile(ptGrp2);
		Matcher mr1 = pt1.matcher(html1);
		while(mr1.find()) {
			System.out.println("Group 1 example is "+mr1.group(1)); 	//Returns html1 as * is greedy quantifiers
		}
		
		String ptGrp3 = "(<h2>.*?</h2>)";
		Pattern pt2 = Pattern.compile(ptGrp3);
		Matcher mr2 = pt2.matcher(html1);
		while(mr2.find()) {
			System.out.println("Group 2 example is "+mr2.group(1)); 	//Returns h2 tags as ? is lazy quantifiers
		}
		
		String ptGrp4 = "(<h2>)(.*?)(</h2>)";
		Pattern pt3 = Pattern.compile(ptGrp4);
		Matcher mr3 = pt3.matcher(html1);
		while(mr3.find()) {
			System.out.println("Group 1 is "+mr3.group(1));
			System.out.println("Group 2 is "+mr3.group(2));		//Returns the string between h2 open and close tags as ? is lazy quantifier
			System.out.println("Group 3 is "+mr3.group(3));
		}
	}

}
