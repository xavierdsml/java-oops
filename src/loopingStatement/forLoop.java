package loopingStatement;
import java.util.Scanner;

public class forLoop {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number for printing the table : ");
        int number = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(number +" * " + i + " = " + number*i);
        }
    }
}
