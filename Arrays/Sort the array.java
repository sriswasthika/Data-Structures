import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		    for(int j=i+1;j<a.length;j++){
		        if(a[i]>a[j]){
		            int t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		    }
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
