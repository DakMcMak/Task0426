
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0 && number > 0){
            System.out.println("положительное четное число");
        }
        if (number % 2 == 1 && number > 0){
            System.out.println("положительное нечетное число");
        }
        if (number % 2 == 0 && number < 0){
            System.out.println("отрицательное четное число");
        }
        if (number % 2 == -1 && number < 0){
            System.out.println("отрицательное нечетное число");
        }
        if (number == 0){
            System.out.println("ноль");
        }
    }
}
