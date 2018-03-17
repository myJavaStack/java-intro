import java.util.*;
import java.text.DateFormat;

public class AgeCalculatorApp
{
    public static void main(String[] args)
    {
        GregorianCalendar today = new GregorianCalendar();
        int todaysYear = today.get(Calendar.YEAR);
        int todaysMonth = today.get(Calendar.MONTH) + 1;
        int todaysDay = today.get(Calendar.DAY_OF_MONTH);
        DateFormat shortDate = DateFormat.getDateInstance();

        System.out.println("Welcome to the age calculator.\n");
        
        //Get the user's birthdate
        Scanner sc = new Scanner(System.in);
        int birthMonth = Validator.getInt(sc, "Enter the month you were born (1 to 12): ",
            0, 13);
        int birthDay = Validator.getInt(sc, "Enter the day of the month you were born: ",
            0, 32);
        int birthYear = Validator.getInt(sc, "Enter the year you were born (four digits): ",
        todaysYear - 111, todaysYear + 1);

        //Create a GregorianCalendar object for the user's birthday and print it
        GregorianCalendar birthDate = new GregorianCalendar(
            birthYear, birthMonth - 1, birthDay);
        System.out.println();
        System.out.println("Your birth date is " + shortDate.format(birthDate.getTime()));

        //Print the current date
        System.out.println("Today's date is " + shortDate.format(today.getTime()));

        //Calculate and print the user's age
        int age = todaysYear - birthYear;
        if (todaysMonth < birthMonth)
            age -= 1;
        if (todaysMonth == birthMonth && todaysDay < birthDay)
                age -= 1;

        System.out.println("Your age is: " + age);

    }
}