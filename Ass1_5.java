// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package FirstAss;
import java.util.Scanner;

public class Ass1_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.println("Enter a number (enter x to stop) : ");
            String inp = sc.nextLine();

            if(inp.equalsIgnoreCase("x")){
                break;
            }
            try{
                int num = Integer.parseInt(inp);
                sum += num;
            }catch(NumberFormatException e){
                System.out.println("Enter a valid character!!!");
            }
        }
        sc.close();
        System.out.println("The sum of numbers is : "+sum);
    }
}