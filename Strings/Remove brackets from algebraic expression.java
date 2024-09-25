import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(),r="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='(' || s.charAt(i)==')' || s.charAt(i)=='[' || s.charAt(i)==']' || s.charAt(i)=='{' || s.charAt(i)=='}'){
		        continue;
		    }
		    else{
		        r+=s.charAt(i);
		    }
		}
		System.out.println(r);
	}
}
