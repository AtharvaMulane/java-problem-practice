package FirstAss;

import java.util.*;
public class Inputs{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your rollno : ");

        int rno = ip.nextInt();
        System.out.println("Your rollno is: "+rno);

        ip.close();
    }
}