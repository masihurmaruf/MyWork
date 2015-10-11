/**
 * 
 */
package com.infix.qa;

/**
 * @author Masihur
 *
 */
public class CodingBatPracLogicOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sumLimit(1, 11);
		sumLimit(1, 1);

	}
	public static boolean love6(int a, int b){
		
		
		int resSub =Math.abs(a-b);
		int resAdd = a+b;
		if((a==6)||(b==6)){
			System.out.println("true");
			return true;
		}
		else if ((resSub==6)||(resAdd==6)){
			System.out.println("true");
			return true;
			
		}
		else{
			System.out.println("false");
			return false;
		}
		
	}
	public static boolean nearTen(int num){
		if((num%10==1)||(num%10==2)||(num%10==8)||(num%10==9)||(num%10==0)){
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}
	public static boolean more20(int n){
		if((n%20==1)||(n%20==2)){
			System.out.println("true");
			return true;
		}
		else {
			
			System.out.println("false");
			return false;
		}
	}
	public static int teaParty(int tea, int candy){

		if(candy<5 || tea<5){
			System.out.println(0);
			return 0;
		}
		else{
			if((tea*2<=candy)||(candy*2<=tea)){
			System.out.println(2);
			return 2;
			}
			else {
				System.out.println(1);
				return 1;
			
			}
		}
	
	}
	public static boolean twoAsOne(int a, int b, int c){
		if(((a+b)==c)||((b+c)==a)||((a+c)==b)){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
	public static boolean lastDigit(int a, int b, int c){
		if(((a%10)==(b%10))||((b%10)==(c%10))||((c%10)==(a%10))){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println(false);
			return false;
		}
		
	}
	public static int maxMod5(int a, int b){
		int c=a%5;
		int d=b%5;
		
		if(c==d){
			if(a==b){
				System.out.println(0);
				return 0;
			}
			else if(a>b){
				System.out.println(b);
				return b;
			}
			else{
				System.out.println(a);
				return a;
			}
		}
		else if(a>b){
			System.out.println(a);
			return a;
		}
		else{
			System.out.println(b);
			return b;
		}	
	}
	public static int blueTicket(int a, int b, int c){
	
		int ab=a+b;
		int bc=b+c;
		int ac=a+c;
		
		if(ab==10 ||ac==10 || bc==10){
			System.out.println(10);
			return 10;
		}
		else if(ab==10+bc || ab==10+ac){
			System.out.println(5);
			return 5;
		}
		else{
			System.out.println(0);
			return 0;
		}
	}
	public static int dateFashion(int you, int date){
		
		if((you<=2)||(date<=2)){
			System.out.println(0);
			return 0;
		}
			else if((you>=8)||(date>=8)){
			System.out.println(2);
			return 2;
		}
		
		else{
			System.out.println(1);
			return 1;
		}
	}
	public static int sortaSum(int a, int b){
		int result = a+b;
		if((result>=10)&&(result<=19)){
			System.out.println(20);
			return 20;
		}
		else{
			System.out.println(result);
			return result;
		}
		
	}
	public static boolean in1To10(int n, boolean outsideMode){
		if(outsideMode){
			if((n<=1)||(n>=10)){
				System.out.println("true");
				return true;
			}
			else{
				System.out.println("false");
				return false;
			}
		}
		else{
			if((n>=1)&&(n<=10)){
				System.out.println("true");
				return true;
			}
			else{
				System.out.println("false");
				return false;
			}
		}
	}
	
	public static boolean old35(int n){
	
		if (n%3==0){
			if(n%5==0){
				System.out.println("false");
				return false;	
			}
			else{
				System.out.println("true");
				return true;
			}
		}
		if(n%5==0){
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}
	public static int teenSum(int a, int b){
		int result = a+b;
		if(((a>=13)&&(a<=19))||((b>=13)&&(b<=19))){
			System.out.println(19);
			return 19;
		}
		else{
			System.out.println(result);
			return result;
		}
	}
	public static String fizzString(String str){
		if((str.startsWith("f"))&&(str.endsWith("b"))){
			System.out.println("fizzbuzz");
			return "fizzbuzz";
		}
		if(str.startsWith("f")){
			System.out.println("fizz");
			return "fizz";
		}
		if(str.endsWith("b")){
			System.out.println("buzz");
			return "buzz";
			
		}
	return str;
}
	public static boolean inOrder(int a, int b, int c, boolean bOk){
		if(bOk){
			if((c>b)){
				System.out.println("true");
				return true;
			}
			else{
				System.out.println("false");
				return false;
			}
		}
		if((b>a)&&(c>b)){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
	public static boolean lessBy10(int a, int b, int c){
		int p=Math.abs(a-b);
		  int q= Math.abs(b-c);
		  int r=Math.abs(c-a);
		if((p>=10)||(q>=10)||(r>=10)){
			System.out.println("true");
			return true;
		}else{
			System.out.println("false");
			return false;
		}
		
	}
	public static int redTicket(int a, int b, int c){
		
		if((a==b)&&(b==c)){
			if(a==2){
				System.out.println(10);
				return 10;
			}
			else{
				System.out.println(5);
				return 5;
			}
		}
		else if((a!=b)&&(a!=c)){
			System.out.println(1);
			return 1;
		}
		else{
			System.out.println(0);
			return 0;
		}
		
		
	}
	
	public static boolean shareDigit(int a, int b){
		
		if(a%10==b%10){
			System.out.println("true");
			return true;
		}
		else if(a%10==b/10){
			System.out.println("true");
			return true;
		}
		else if(a/10==b/10){
			System.out.println("true");
			return true;
		}
		else if(a/10==b%10){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			if ((temp < 60) || (temp > 100)) {
				System.out.println("false");
				return false;
			}
			else{
				System.out.println("true");
				return true;
			}

		}
		if ((temp < 60) || (temp > 90)) {
			System.out.println("false");
			return false;
		}
		System.out.println("true");
		return true;

	}

	public static String alarmClock(int day, boolean vacation) {
		String alarmWeekDays = "7.00";
		String alarmWeekDaysVacation = "10.00";
		String alarmWeekendVacation = "off";
		String alarmWeekend = "10.00";
		if (vacation == true) {
			if (day % 6 == 0) {
				System.out.println(alarmWeekendVacation);
				return alarmWeekendVacation;

			} else {
				System.out.println(alarmWeekDaysVacation);
				return alarmWeekDaysVacation;
			}
		}
		if (day % 6 == 0) {
			System.out.println(alarmWeekend);
			return alarmWeekend;
		}
		System.out.println(alarmWeekDays);
		return alarmWeekDays;
	}

	public static boolean specialEleven(int n) {
		if ((n % 11 == 0) || (n % 11 == 1)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	public static boolean less20(int n) {
		if ((n % 20 == 18) || (n % 20 == 19)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			System.out.println("false");
			return false;
		}
		if (isMorning) {
			if (isMom) {
				System.out.println("true");
				return true;
			} else {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;

	}

	public static String fizzString2(int n) {
//		String number = "";
//		if (n % 3 == 0)
//			number += "Fizz";
//		if (n % 5 == 0)
//			number += "Buzz";
//		if (number.length() != 0) {
//
//			return number;
//		}
//		System.out.println(n + "!");
//		return number;
		String number = "";
		if(n % 3==0){
			if(n % 5==0){
				number+="Fizzbuzz";
			}
			else number+="Buzz";
		}
		else if(n%5==0){
			number+="Fizz";
		}
		else
			number+=Integer.toString(n);
		return number+"!";
	
	
	
	}

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

		if (equalOk) {
			if (a <= b) {
				if (b <= c) {
					System.out.println("true");
					return true;
				} else {
					System.out.println("false");
					return false;
				}
			} else {
				System.out.println("false");
				return false;
			}
		} else {
			if (a < b) {
				if (b < c) {
					System.out.println("true");
					return true;
				} else {
					System.out.println("false");
					return false;
				}
			} else {
				System.out.println("false");
				return false;
			}
		}

	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		int x = 0;
		int y = 1;
		int z = 2;

		if (isBirthday == true) {
			speed = speed - 5;
		}

		if (speed <= 60) {
			System.out.println(x);
			return x;
		} else if (speed < 81) {
			System.out.println(y);
			return y;
		} else {
			System.out.println(z);
			return z;
		}
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {

		if (isWeekend) {
			if (cigars >= 40) {
				return true;
			}
			return false;
		} else {
			if (cigars >= 40 && cigars<=60) {
				return true;
			} 
			return false;
		}
	}

	public static int sumLimit(int a, int b) {
		String stringTest = String.valueOf(a);
		String stringTestResult = String.valueOf(a+b);
		if (stringTestResult.length() == stringTest.length()) {
			System.out.println(stringTestResult);
			return a + b;
		} else {
			System.out.println(a);
			return a;

		}
//		String stringA = Integer.toString(a);
//		String result = Integer.toString(a + b);
//		System.out.println(result);
//
//		if (result.length() == stringA.length()) {
//			System.out.println(result);
//			return a + b;
//		} else {
//			System.out.println(a);
//			return a;
//
//		}

	}

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		int result = die1 + die2;
		if ((noDoubles) && (die1 == die2)) {
			if (die1 == 6)
				die1 = 1;
			else
				die1 = die1 + 1;
			System.out.println(die1 + die2);

		} else {
			System.out.println(result);
			return result;
		}
		return result;
	}

	public static int greenTicket(int a, int b, int c) {

		if (a == b) {
			if (c == a) {
				System.out.println(20);
				return 20;
			} else {
				System.out.println(10);
				return 10;
			}
		}

		else if (a != b) {
			if ((a == c) || (b == c)) {
				System.out.println(10);
				return 10;
			} else {
				System.out.println(0);
				return 0;
			}
		} else {
			return 0;
		}

	}

}
