package methods;
import java.util.Scanner;

public class methodBasic {
    public static int sum (int a, int b) {
        return a+b;
    }

    private static void greet() {
        System.out.println("Hello, Welcome to the Methods of the greet");
    }

    public static int randomInt(){
        return (int)(Math.random()*10);
    }



    public static int randomNumberBetweenTwoInteger(int a, int b){
        return (int)(Math.random()*(b-a+1)+a);
    }




    public static void main(String[] args) {
        System.out.println(sum(10,20));

        greet();
        System.out.println(Math.min(10,20));
        System.out.println(Math.max(10,20));
        System.out.println(Math.abs(-10));
        System.out.println((int)Math.pow(10,2));
        System.out.println(Math.random());
        System.out.println(Math.floor(5.8));
        System.out.println(Math.ceil(7.9));
        System.out.println(Math.round(10.8));




        System.out.print("\nPrinting the random number between 0 to 10 : ");
        System.out.println(randomInt());


        System.out.println("\nPrinting the random number between a to b ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The random number between " + a + " and " + b + " is " + randomNumberBetweenTwoInteger(a, b));
    }
}
