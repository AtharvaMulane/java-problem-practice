//Converion of celcius to Farenhite
package FirstAss;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter temperature in Cel : ");
        float temp = inp.nextFloat();
        inp.close();

        float tempC = (temp * 9/5) + 32;

        System.out.println("Temperature in Farenhite : "+tempC);

    }

}
