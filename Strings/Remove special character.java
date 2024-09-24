import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(),r="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'){
		        r+=s.charAt(i);
		    }
		    else{
		        continue;
		    }
		}
		System.out.println(r);
	}
}
