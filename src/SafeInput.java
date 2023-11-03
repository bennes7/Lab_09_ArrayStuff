import java.util.Scanner;
public class SafeInput
{
    public static String prettyHeader(Scanner pipe, String prompt)
    {
        String retVal = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() == 0)
            {
                System.out.println("You must enter an input: ");
            }
        }while(retVal.length() == 0);

        int length = retVal.length();
        int space = 54 - length;
        int right = space / 2;
        int left = 0;

        if (space % 2 == 0)
        {
            left = right;
        }
        else
        {
            left = right + 1;
        }

        for (int x = 1; x <= 1; x++)
        {
            for (int n = 1; n <= 60; n++) {
                System.out.print("*");
            }
            System.out.println();


            for (int n = 1; n <= 1; n++) {
                System.out.print("***");
                for (int r = 1; r <= right; r++) {
                    System.out.print(" ");
                }
                System.out.print(retVal);
                for (int l = 1; l <= left; l++) {
                    System.out.print(" ");
                }
                System.out.print("***");
            }
            System.out.println();
            for (int n = 1; n <= 60; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return retVal;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said the value is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your the value is " + retVal + " but that is out of range [" + low + " - " + high +"]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }

        } while(!done);

        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not " + trash);
            }

        } while(!done);

        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said the value is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your the value is " + retVal + " but that is out of range [" + low + " - " + high +"]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.length()>0)
            {
                done = true;
            }
            else //don't have an int
            {
                System.out.println("You must enter at least one character ");
            }

        } while(!done);

        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String pattern)
    {
        String retVal="";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.matches(pattern))
            {
                done = true;
            }
            else
            {
                System.out.println("What you entered does not match the pattern. " + pattern);
            }
        }while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String respYN = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print(prompt + "[Y/N]: ");
            respYN = pipe.nextLine();

            if (respYN.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (respYN.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter [Y/N]: ");
            }
        } while (!done);

        return retVal;
    }
}
