package Java;

import java.util.Scanner;

public class WelcomeProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age ;
        String nationality ;
        System.out.println("please enter your age ");
        age = input.nextInt();
        System.out.println("please enter your nationality ");
        nationality= input.next();
        if (nationality.equals("Egyption") && age>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("not eligible");

    }
}
