import java.io.*;
import java.util.*;
import java.util.Scanner;
public class comparingTwoFiles {
    public static void main(String[] args ) throws FileNotFoundException {
        String first = "", second = "";
        String firstName = "",
                secondName ="";

        Scanner input =  new Scanner(System.in);
        System.out.print("");
        firstName = input.nextLine();
        System.out.print("");
        secondName = input.nextLine();
        Scanner input1 = new Scanner(new File(firstName));//read first file //i have to input first file location.
        Scanner input2 = new Scanner(new File(secondName));//read second file // i have to input second file location.

        while(input1.hasNextLine() && input2.hasNextLine()){
            first = input1.nextLine();
            second = input2.nextLine();

            if(!first.equals(second)){
                System.out.println("Differences found: "+"\n"+first+'\n'+second);
            }
        }

// optionally handle any remaining lines if the line count differs
    }
}
