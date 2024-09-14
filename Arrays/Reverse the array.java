import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int start=0,end=n-1;
		int a[]=new int[n];
    System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		while(start<end){
		    int t=a[start];
		    a[start]=a[end];
		    a[end]=t;
		    start++;
		    end--;
		}
    System.out.print("The reversed array is:");
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
