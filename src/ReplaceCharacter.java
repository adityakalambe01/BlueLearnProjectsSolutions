import java.util.Arrays;
import java.util.Scanner;

public class ReplaceCharacter {


    /*
    *
    * This function will combine character array and return String
    *
    * */
    public static String convertIntoString(char[] charArray){
        String combinedString = "";
        for (char ch : charArray){
            combinedString+=String.valueOf(ch);
        }
        return combinedString;
    }

    /*
    *
    * This function will replace old character with new character
    *
    * */

    public static String replaceCharacter(String inputString, char oldCharacter, char newCharacter){
        char[] inputStringCharArray = inputString.toCharArray();
        int i = 0;
        for (char ch : inputStringCharArray){
            if(ch==oldCharacter){
                inputStringCharArray[i] = newCharacter;
            }
            i++;
        }

        return convertIntoString(inputStringCharArray);
    }


    /*
    *
    * Main Method
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter character you want to replace: ");
        char oldCharacter = scanner.next().charAt(0);

        System.out.print("Replace with: ");
        char newCharacter = scanner.next().charAt(0);

        inputString = replaceCharacter(inputString, oldCharacter, newCharacter);

        System.out.println(inputString);
    }
}
