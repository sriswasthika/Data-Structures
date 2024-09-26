public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int sum=0;
    for(int i=0;i<str.length();i++){ 
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        sum+=(str.charAt(i)-'0');
        }
      }
    System.out.println("Sum of all digits " +sum );
  }
}
