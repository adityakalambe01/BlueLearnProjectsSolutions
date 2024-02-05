import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}
public class ReturnOddBetweenRange {
    static void printOdd(int low, int high){
        int count = 0;
        for (int i = low; i <= high; i++) {
            if(i%2==1) count++;
        }
        System.out.println(count);
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int low = scanner.nextInt();
            int high = scanner.nextInt();
            if(low<0 || high<0){
                throw new NegativeNumberException("Negative Number Not allowed");
            }
            if (low>high){
                printOdd(high, low);
            }else {
                printOdd(low, high);
            }
        }catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
