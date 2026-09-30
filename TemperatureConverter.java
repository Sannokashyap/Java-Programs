/*Description: Create a program that converts
temperatures between Celsius and
Fahrenheit. Prompt the user to enter a
temperature value and the unit of
measurement, and then perform the
conversion. Display the converted
temperature. */


import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        
        System.out.print("Enter unit (C/F): ");
        char unit = sc.next().charAt(0);

     
        if (unit == 'C' || unit == 'c') {

            double fahrenheit = (temperature * 9 / 5) + 32;

            System.out.println("Converted temperature: "
                    + fahrenheit + "°F");

        } else if (unit == 'F' || unit == 'f') {

            double celsius = (temperature - 32) * 5 / 9;

            System.out.println("Converted temperature: "
                    + celsius + "°C");

        } else {

            System.out.println("Invalid unit. Please enter C or F.");
        }

           }
}

