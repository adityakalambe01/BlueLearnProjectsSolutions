import java.util.Scanner;

public class PrimeOrFactor {

    static boolean checkPrime(int number){
        if (number<=1) return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number%i==0) return false;
        }
        return true;
    }

    static void printFactor(int number){
        for (int i = 2; i <= number; i++) {
            if (number%i==0) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(checkPrime(number)){
            System.out.println("Prime Number");
        }else {
            printFactor(number);
        }
    }
}
