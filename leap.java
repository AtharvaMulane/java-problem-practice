package FirstAss;

import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        sc.close();

        if(year % 4 == 0 && year % 400 != 0){
            System.out.println("The year is leap year");
        }else{
            System.out.println("It is not leap year");
        }
    }
}
