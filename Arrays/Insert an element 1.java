// APPROACH 1

//Here’s how to do it.

//First get the element to be inserted, say x.
//Then get the position at which this element is to be inserted, say pos.
//Create a new array with the size one greater than the previous size.
//Copy all the elements from previous array into the new array till the position pos.
//Insert the element x at position pos.
//Insert the rest of the elements from the previous array into the new array after the pos.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		int n=sc.nextInt();
		int i=0;
		System.out.println("Enter the elements in array: ");
		int a[]=new int[n];
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be insserted in array: ");
		int e=sc.nextInt();
		System.out.println("Enter the positon of the element to be insserted in array: ");
		int p=sc.nextInt();
		int b[]=new int[n+1];
		for(i=0;i<n+1;i++){
		    if(i<p-1)
		        b[i]=a[i];
		    else if(i==p-1)
		        b[i]=e;
		    else
		        b[i]=a[i-1];
		}
		System.out.println("The updated array is: ")
		for(i=0;i<n+1;i++){
		    System.out.print(b[i]+" ");
		}
	}
}
