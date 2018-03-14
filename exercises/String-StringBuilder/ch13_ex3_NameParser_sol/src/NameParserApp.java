import java.util.Scanner;

public class NameParserApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the name parser.\n");
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        name = name.trim();

        String[] words = name.split(" ");
        if (words.length < 2 || words.length > 3)
            System.out.println("Name not in valid format.");
        else
        {
            System.out.println();
            switch (words.length)
            {
                case 2:
                    System.out.println("First name:  " + words[0]);
                    System.out.println("Last name:   " + words[1]);
                    break;
                case 3:
                    System.out.println("First name:  " + words[0]);
                    System.out.println("Middle name: " + words[1]);
                    System.out.println("Last name:   " + words[2]);
                    break;
            }
        }
    }
}