/*
    Проверяет, является ли строка палиндромом
*/
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];

            System.out.println(s + ": " + isPalindrome(s));
        }
    }

    //Переворачивает строку s
    public static String reverseString(String s) {
        String reverse = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    //Проверяет, является ли строка s палиндромом
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}