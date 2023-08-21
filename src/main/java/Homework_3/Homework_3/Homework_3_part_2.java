package Homework_3.Homework_3;
import java.util.Scanner;

public class Homework_3_part_2
{
    // Лице и периметър на правоъгълник
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете височина на правоъгълник: ");
        int heght = sc.nextInt();
        System.out.println("Въведете дължина на правоъгълник: ");
        int lenght = sc.nextInt();
        int areа = heght * lenght;
        int perimeter = 2 * (heght + lenght);
        System.out.println("Лицето на правоъгълника е :" + areа);
        System.out.println("Периметърът на правоъгилника е :" + perimeter);
    // Even or odd
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " " + "it's even.");
        else
            System.out.println(num + " " + "it's odd.");


    }
    }