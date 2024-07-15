//Take 2 numbers as inputs and find their HCF and LCM.
package FirstAss;

import java.util.Scanner;
public class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        sc.close();

        int HCF = calculateHCF(num1, num2);
        int LCM = calculateLCM(num1, num2, HCF);

        System.out.println("The HCF is : "+HCF);
        System.out.println("The LCM is : "+LCM);
    }
    public static int calculateHCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b, int HCF){
        return (a * b) / HCF;
    }
}