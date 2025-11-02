package basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        System.out.println("The age of the person is "+sc.nextInt());
        sc.close();
    }
}
