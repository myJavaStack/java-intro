import java.util.Scanner;

public class Validator
{
    public static String getSSN(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        boolean isValidSSN = false;
        String ssn = "";
        while (isValidSSN == false)
        {
            ssn = sc.nextLine(); // read entire line
            if (ssn.length() != 11)
            {
                System.out.println("Error! Invalid Social Security Number. Try again.");
                System.out.print(prompt);
            }
            else if (isNumeral(ssn.charAt(0))
                  & isNumeral(ssn.charAt(1))
                  & isNumeral(ssn.charAt(2))
                  & ssn.charAt(3) == '-'
                  & isNumeral(ssn.charAt(4))
                  & isNumeral(ssn.charAt(5))
                  & ssn.charAt(6) == '-'
                  & isNumeral(ssn.charAt(7))
                  & isNumeral(ssn.charAt(8))
                  & isNumeral(ssn.charAt(9))
                  & isNumeral(ssn.charAt(10)) )
            {
                isValidSSN = true;
            }
            else
            {
                System.out.println("Error! Invalid Social Security Number. Try again.");
                System.out.print(prompt);
            }
        }
        return ssn;
    }

    private static boolean isNumeral(char c)
    {
        if (c == '0' | c == '1' | c == '2' | c == '3' |
            c == '4' | c == '5' | c == '6' | c == '7' |
            c == '8' | c == '9')
            return true;
        else
            return false;
    }

    public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard any other data entered on the line
        return s;
    }

    public static String getLine(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }

    public static int getInt(Scanner sc, String prompt)
    {
        boolean isValid = false;
        int i = 0;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                    "Error! Number must be greater than " + min);
            else if (i >= max)
                System.out.println(
                    "Error! Number must be less than " + max);
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        boolean isValid = false;
        double d = 0;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                    "Error! Number must be greater than " + min);
            else if (d >= max)
                System.out.println(
                    "Error! Number must be less than " + max);
            else
                isValid = true;
        }
        return d;
    }
}