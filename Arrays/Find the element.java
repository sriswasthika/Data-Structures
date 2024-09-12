import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int f=0;
		int a[]=new int[n+1];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("Enter the search element:");
		int s=sc.nextInt();
		for(int i=0;i<n;i++){
		    if(a[i]==s){
		        f=0;
		        System.out.println(s+" is found at "+(i+1));
		        break;
		    }
		    else{
		        f=1;
		    }
		}
		if(f==1){
		    System.out.println(s+"is not found");
		}
	}
}
