import java.util.Scanner;

public class PalindromeAnagram {
    public static String canFormPalindrome(String s) {
        int oddCount = 0;

        for (char c = 'a'; c <= 'z'; c++) {

            int charCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    charCount++;
                }
            }


            if (charCount % 2 != 0) {
                oddCount++;
            }
        }


        return oddCount > 1 ? "NO" : "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println(canFormPalindrome(str)); 
    }
}