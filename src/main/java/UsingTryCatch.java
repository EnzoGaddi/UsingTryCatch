/*
Enzo Gaddi
21/10/24

 */

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args){

        System.out.println("Please enter a number between 0 - 9 :");
        Scanner myscan = new Scanner(System.in);

        try {
            int myNum = -1;

            while (myNum < 0 || myNum > 9) {
                // Read user input as a String
                String input = myscan.nextLine();

                // Parse the input to an integer

                try {
                    myNum = Integer.parseInt(input);
                    // Check if the number is between 0 and 9
                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("You entered " + myNum);
                    } else {
                        System.out.println("Not valid ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Try again! " + e.getMessage());
                }
            }
          }
        finally
        {
            myscan.close();
        }
        }
    }



//try{}
//catch(ArithmeticException ae)
//finally { scan.close(); }
//.getMessage()
