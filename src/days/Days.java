/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 */
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Weekdays[] days = Weekdays.values(); // this creates an array of days of the weekday (Monday - Friday) from the enum. The values() method is used because it creates an array that has all the values of enum.
    for (Weekdays daytemp : days){ // a for-each loop is used because it is designed to iterate over elements in an array.
        System.out.println(daytemp.name()); // printing the days of the week day.
    }
    }// TODO code application logic here
    
    
}
