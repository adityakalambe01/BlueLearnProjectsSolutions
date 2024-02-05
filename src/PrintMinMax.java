import java.util.Scanner;

public class PrintMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numberArray = new int[n];
        for (int i = 0; i < n; i++) {
            numberArray[i] = scanner.nextInt();
        }

        int minimumNumber = Integer.MAX_VALUE;
        int maximumNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(numberArray[i]>maximumNumber){
                maximumNumber=numberArray[i];
            } else if (numberArray[i]<minimumNumber) {
                minimumNumber=numberArray[i];
            }
        }

        System.out.println("Maximum Element: "+maximumNumber+", Minimum Element: "+minimumNumber);

    }
}
