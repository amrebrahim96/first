package Java;

import java.util.Scanner;

public class WelcomeProject {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
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
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade;
        grade = input.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good ");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(i);
        }


        int number ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter random number");
        number = input.nextInt();
        if (number % 2 ==0 )
            System.out.println("even number");
        else
            System.out.println("odd number");


        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter day number  ");
        int number ;
        number = input.nextInt();
         switch (number)

         {
             case 1 :
                 System.out.println("Saturday");
                 break;
             case 2 :
                 System.out.println("Sunday");
                 break;
             case 3 :
                 System.out.println("Monday");
                 break;
             case 4 :
                 System.out.println("Tuesday");
                 break;
             case 5 :
                 System.out.println("Wednesday");
                 break;
             case 6 :
                 System.out.println("Thuresday");
                 break;
             case 7 :
                 System.out.println("Friday");
                 break;
             default:
                 System.out.println("invalid option ");
         }


        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students");
        int number;
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("for the student number" + i);
            System.out.println("please enter your name");
            String name;
            name = input.next();
            for (int S = 1; S <= 3; S++) ;
            {
                System.out.println("please enter last 3 exam scores");
                double score ;
                score = input.nextDouble();
                score += score ;
                System.out.println( "average = " + (score/3) );
            }


        int number ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter random number");
        number = input.nextInt();
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("number *" + i  + "=");
            int multiply ;
            multiply = number * i ;
            System.out.println(multiply);
        }


       */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students");
        int number;
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("for the student number" + i);
            System.out.println("please enter your name");
            String name;
            name = input.next();
            System.out.println("Enter your exam score 1 ");
            double score1 = input.nextDouble();
            System.out.println("Enter your exam score 2 ");
            double score2 = input.nextDouble();
            System.out.println("Enter your exam score 3 ");
            double score3 = input.nextDouble();
            double total, average;
            total = sum(score1, score2, score3);
            average = avg(score1, score2, score3);
            System.out.println("the total score = " + total);
            System.out.println("the average =" + average);
            if (average >= 85)
                System.out.println("your grade is A");
            else if (average >= 70)
                    System.out.println("your grade is B");
                else if (average >= 50)
                    System.out.println("your grade is C");
                else
                    System.out.println("your grade is F");


        }


    }

    public static double sum(double a, double b, double c) {
        double result;
        result = a + b + c;
        return result;


    }

    public static double avg(double a, double b, double c) {
        double result;
        result = (a + b + c) / 3;

        return result;


    }

}