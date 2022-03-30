package Chapter_10;
/**
 * Ethan hunt
 * 3/30/22
 */
import java.lang.reflect.Array;

public class Exercise10_3 {
	public static void main(String[] args) {
		int number = 7;
		MyInteger MyInteger1 = new MyInteger(7);
		char[] array = {'1','2','3'};
		String st = "13";	
		
		System.out.println(MyInteger.isEven(MyInteger1));
		System.out.println(MyInteger.isOdd(MyInteger1));
		System.out.println(MyInteger.isPrime(MyInteger1));
		System.out.println(MyInteger1.equals(7));
		System.out.println(MyInteger.parseIntI(array));
		System.out.println(MyInteger.parseIntS(st));
	}
}
class MyInteger{
	static int value = 7;
	MyInteger(){
		
	}
MyInteger(int value){
	this.value = value;
}

//checks if integer is even and returns true or false
boolean isEven() {
	int num = 7;
	if(num % 2 == 0) {
		return true;
	} else {
		return false;
	}
}
//checks if integer is even and returns true or false
boolean isOdd() {
	int num = 7;
	if(num % 2 == 1) {
		return true;
	} else {
		return false;
	}
}
boolean isPrime() {
	int num = 7;
	boolean flag = false;
	for(int i = 2; i <= num/2; ++i) {
		if(num % i ==0) {
			flag = true;
			break;
		}
	}
	if(!flag) {
		return true;
	} else {
		return false;
	}
}
//checks if "value" is even
static boolean isEven(int value) {
	
	if(value % 2 == 0) {
		return true;
	} else {
		return false;
	}
}
//checks if "value" is odd
static boolean isOdd(int value) {
	
	if(value % 2 == 1) {
		return true;
	} else {
		return false;
	}
}
//checks if "value" is prime
static boolean isPrime(int value) {
	
	boolean flag = false;
	for(int i = 2; i <= value/2; ++i) {
		if(value % i ==0) {
			flag = true;
			break;
		}
	}
	if(!flag) {
		return true;
	} else {
		return false;
	}
}
//checks if MyInteger1.value is even
static boolean isEven(MyInteger MyInteger1) {
	int value = MyInteger.value;
	boolean checker = isEven(value);
	if(checker == true) {
	return true;
	} else {
		return false;
	}
}
////checks if MyInteger1.value is odd
static boolean isOdd(MyInteger MyInteger1) {
	int value = MyInteger.value;
	boolean checker = isOdd(value);
	if(checker == true) {
		return true;
	} else {
		return false;
	}
}
//checks if MyInteger1.value is prime
static boolean isPrime(MyInteger MyInteger1) {
	int value = MyInteger.value;
	boolean checker = isPrime(value);
	if(checker == true) {
		return true;
	} else {
		return false;
	}
}
boolean equals(int value) {
	if( value == MyInteger.value) {
		return true;
	} else return false;
} 
//checks if values are equal
boolean equals(MyInteger MyInteger1) {
	if(MyInteger1.value == MyInteger.value) {
		return true;
	} else {
		return false;
	}
}
//converts char to int
static int parseIntI(char[] convert) {
	int num = 0;
	
	for(int i  = 0; i < convert.length; i++) {
		
		char a = convert[i];
		num = Character.getNumericValue(a);
		num += num;
	}
	
	return num;
}
//converts string to int
static int parseIntS(String st) {
	int num = Integer.parseInt(st);
	
	
	return num;
}
}