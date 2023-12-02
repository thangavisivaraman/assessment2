package assessment2;

import java.util.Scanner;

public class Q3 {

	public static void pairs(int[]arr,int length,int k) {
		int count=0;
	     System.out.println("sum of the pairs divided by"+k+"are:");
			for(int i=0;i<length;i++) {
				for(int j=i+1;j<length;j++) {
					if((arr[i]+arr[j])%k==0) {
						count++;
						System.out.println("["+arr[i]+" "+arr[j]+"]");
						
					}
				}

			}
	            System.out.println("Pairs sum divisible by"+" "+k+":"+count);
			}
	
	

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length:");
	int length=sc.nextInt();
	int[]arr=new int[length];
	System.out.println("Enter the elements:");
	for(int i=0;i<length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the value of k:");
	int k=sc.nextInt();
	pairs(arr,length,k);
}
}
