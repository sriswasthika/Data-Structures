import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(),t="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==32){
		        continue;
		    }
		    else{
		        t+=s.charAt(i);
		    }
		}
		System.out.println(t);
	}
}
