import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int s=0;
		System.out.println("Enter the elements:");
		int a[]=new int[n+1];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    s+=a[i];
		}
		float f=(float)s;
		System.out.println("The average value of total elements is: "+ (f/n));
	}
}
