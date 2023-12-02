package assessment2;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int arm=sc.nextInt();
		int sum=0;
		int temp=arm;
		while(temp>0) {
			int digit=temp%10;
			sum+=digit*digit*digit;
			temp/=10;
			}
		if(sum==arm) {
			System.out.println(arm +" " + "is an armstrong number");
		}else {
			System.out.println(arm + " " + "is not an armstrong number");
		}

	}

}
