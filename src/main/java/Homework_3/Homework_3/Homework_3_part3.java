package Homework_3.Homework_3;
import java.util.Scanner;
public class Homework_3_part3 {

    public class Homework_3_part_3
    {
        public static void main(String[]args){
            //Дните от седмицата
            Scanner sc = new Scanner(System.in);

                   System.out.println("Enter a number:");
            int daysOfTheWeek = sc.nextInt();

            switch (daysOfTheWeek){
                case 1:
                    System.out.println("You have selected 1. Day of the week is Monday.");
                    break;
                case 2:
                    System.out.println("You have selected 2. Day of the week is Tuesday.");
                    break;
                case 3:
                    System.out.println("You have selected . Day of the week is Wednesday.");
                    break;
                case 4:
                    System.out.println("You have selected 4. Day of the week is Thursday.");
                    break;
                case 5:
                    System.out.println("You have selected 5. Day of the week is Friday.");
                    break;
                case 6:
                    System.out.println("You have selected 6. Day of the week is Saturday.");
                    break;
                case 7:
                    System.out.println("You have selected . Day of the week is Sunday.");
                    break;
                default:
                    System.out.println("There is no day under selected number.Please try again!");
                    break;
            }
        }
    }
}
