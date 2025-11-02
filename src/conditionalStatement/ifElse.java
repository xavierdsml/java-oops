package conditionalStatement;
import java.util.Scanner;

public class ifElse {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }
        else System.out.println("You cannot vote");
        sc.close();
    }
}
