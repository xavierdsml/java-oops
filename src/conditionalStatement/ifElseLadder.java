package conditionalStatement;
import java.util.Scanner;

public class ifElseLadder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for display the day's name: ");
        int days = sc.nextInt();

        if (days==1) System.out.println("Monday");
        else if(days==2) System.out.println("Tuesday");
        else if(days==3) System.out.println("Wednesday");
        else if(days==4) System.out.println("Thursday");
        else if(days==5) System.out.println("Friday");
        else if(days==6) System.out.println("Saturday");
        else if(days==7) System.out.println("Sunday");
        else System.out.println("Invalid day");

        sc.close();
    }
}
