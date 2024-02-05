import java.util.Scanner;

public class CheckPalindrome {
    static boolean isPalindrome(String inputString){
        for (int i = 0; i < inputString.length()/2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String inputString = scanner.nextLine();

        inputString = inputString.replaceAll(" ","").toLowerCase();
        System.out.println(
                isPalindrome(inputString) ? "The given String is palindrome." : "The given String is not palindrome."
        );
    }
}
