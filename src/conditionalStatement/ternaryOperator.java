package conditionalStatement;
import java.util.Scanner;

public class ternaryOperator {
    static void main() {
        int age = 19;
        System.out.println(((age>=18)?"Right to vote":"Not Right to vote"));
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int maxNumber = (a>b) ? (a>c)?a:c : (b>c)?b:c;
        System.out.println(maxNumber);

        sc.close();
    }
}
