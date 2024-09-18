import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		int l=0;
		for(char c1:c.toCharArray())
		    l++;
		System.out.println("The length of string is:"+l);
	}
}
