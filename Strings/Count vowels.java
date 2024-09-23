public class Main {
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }
    static int countVowels(String str, int n) {
        if (n == 1) return isVowel(str.charAt(n - 1));
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

    System.out.print("Total number of Vowel = ");
    System.out.println(countVowels(str, str.length()));
  }
}
