package assessment2;

import java.util.Scanner;

public class Fibonacci_Series {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	if(num<=0) {
		System.out.println("Enter the integer greater than zero");
	}else {
		int[]fib=new int[num];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<num;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println("fibonacci series upto" +" "+ num +":");
		for(int i=num-1;i>=0;i--) {
			System.out.print(fib[i]+" ");
		}
	
	}
	
}
}
