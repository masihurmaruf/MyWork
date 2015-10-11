/**
 * 
 */
package com.infix.qa;



/**
 * @author Masihur
 *
 */
public class CodingBatPracStringOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		conCat("abc", "cat");


	}
	public static String conCat(String a, String b){
		String concatOne="a";
		String concatTwo="b";
		String concatFirst="";
		if(a!=""){
			concatOne = (a.substring(a.length()-1, a.length()));
			concatFirst = a.substring(0, a.length()-1);
		}
		if(b!="")
			concatTwo = (b.substring(0,1));

		if(concatOne.equalsIgnoreCase(concatTwo)){
			//System.out.println(concatFirst+b);
			return concatFirst+b;
		}
		else{
			//System.out.println(a.concat(b));
			return a.concat(b);
		}
		
	}
	public static boolean hasBad(String str){
		
		if((str.matches("bad(.*)"))||(str.matches("(.*)bad(.*)"))){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
		
	}
	public static String nTwice(String str, int n){
		System.out.println(str.substring(0, n)+str.substring(str.length()-n, str.length()));
		return str.substring(0, n)+str.substring(str.length()-n, str.length());
	}
	
	public static String withouEnd2(String str){
		System.out.println(str.substring(1, str.length()-1));
		return str.substring(1, str.length()-1);
	}
	public static String left2(String str){
		if(str.length()>2){
			System.out.println(str.substring(2, str.length())+str.substring(0, 1));
			return str.substring(2, str.length())+str.substring(0, 1);
		}
		else{
			System.out.println(str);
			return str;
		}
	}
	public static String withoutEnd(String str){
		System.out.println(str.substring(1, str.length()-1));
		return str.substring(1, str.length()-1);
	}
	public static String extraEnd(String str){
		System.out.println(str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length()));
		return str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length())+str.substring(str.length()-2, str.length());
	}
	public static String makeAbba(String a, String b){
		System.out.println(a.concat(b.concat(b.concat(a))));
		return a.concat(b.concat(b.concat(a)));
	}
	public static String startWord(String str, String word){
		//TODO incomplete.
		return str;
	}
	public static String extraFront(String str){
		
		if(str.length()<2){
			String stri = str.substring(0);
			String stri3 =stri+stri+stri;
			System.out.println(stri3);
			return stri3;
		}
		else{
			String string = str.substring(0, 2);
			String string3 = string+string+string;
			System.out.println(string3);
			return string3;
		}
	}
	public static String seeColor(String str){
		if(str.startsWith("red")){
			System.out.println("red");
			return "red";
		}
		else if(str.startsWith("blue")){
			System.out.println("blue");
			return "blue";
		}
		else{
			System.out.println("");
			return "";
		}
	}
	public static String lastChars(String a, String b){
		
		
		if((a!="")&&(b!="")){
			String lastCharsA = a.substring(0, 1);
			String lastCharsB = b.substring(b.length()-1, b.length());
			String string = lastCharsA + lastCharsB;
			System.out.println(string);
			return string;
			
		}
		else if ((a!="")&&(b=="")){
			String lastCharsA = a.substring(0, 1);
			System.out.println(lastCharsA+"@");
			return lastCharsA+"@";
		}
		else if((a=="")&&(b!="")){
			String lastCharsB = b.substring(b.length()-1, b.length());
			System.out.println("@"+lastCharsB);
			return "@"+lastCharsB;
		}
		else{
			System.out.println("@@");
			return "@@";
		}
		

		
	}
	public static String middleThree(String str){
		String midString = str.substring(str.length()/2-1, str.length()/2+2);
		System.out.println(midString);
		return midString;
		
	}
	public static boolean endsLy(String str){
		if(str.endsWith("ly")){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
	public static String theEnd(String str, boolean front){
		int length = str.length();
		if(front){
			
			System.out.println(str.substring(0, 1));
			return str;
		}
		else {
			System.out.println(str.substring(length-1, length));
			return str;
			
		}
	}
	public static String nonStart(String a, String b){
		System.out.println(a.substring(1, a.length())+b.substring(1,b.length()));
		return (a.substring(1, a.length())+b.substring(1,b.length()));
	}
	public static String firstHalf(String str){
		if(str.length()%2==0){
			String subStr = str.substring(0, str.length()/2);
			System.out.println(subStr);
			return subStr;
		}
		else{
			String subStr2 = "Not Applicable";
			System.out.println(subStr2);
			return subStr2;
		}
		
	}
	public static String makeOutWord(String out, String word){
		String subOutOne = out.substring(0, 2);
		String subOutTwo =out.substring(2, 4);
		String total = subOutOne+word+subOutTwo;
		System.out.println(total);
		return total;
	}
	public static String helloName(String name){
		String nameGreetings = "Hello "+name+"!";
		System.out.println(nameGreetings);
		return nameGreetings;
	}

}
