import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter character you want to replace: ");
        char oldCharacter = scanner.next().charAt(0);
        char newCharacter = scanner.next().charAt(0);
        inputString = inputString.replace(oldCharacter, newCharacter);
        System.out.println(inputString);
    }
}
