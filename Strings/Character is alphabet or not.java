import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if((c>=65 && c<=90)||(c>=97 && c<=122)){
		    System.out.println("The given character is an alphabet");
		}
		else{
		    System.out.println("The given character is not an alphabet");
		}
	}
}
