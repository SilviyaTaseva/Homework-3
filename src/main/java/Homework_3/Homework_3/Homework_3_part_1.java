package Homework_3.Homework_3;
import java.util.Scanner;

public class Homework_3_part_1
{
//Напишете програма/ метод, която приема от конзолата 3 подадени числа и определя кое е най- голямото.
    public static void main(String[] args)
    {

        int a,b,c,largest;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number: ");
        a= sc.nextInt();

         System.out.println("Enter the second number: ");
        b=sc.nextInt();

         System.out.println("Enter the third number: ");
        c= sc.nextInt();

        largest=c>(a>b?a:b)?c:((a>b)?a:b);
         System.out.println("The largest number is: "+largest);
}
}