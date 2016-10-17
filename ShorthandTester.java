
/**
 * Write a description of class ShorthandTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import chn.util.*;

public class ShorthandTester
{
    public static void main(String[] args)
    {
        //declares and instantiates input object
        ConsoleIO keyboard = new ConsoleIO();
        Shorthand shrthnd;
        
        String input, output, tag;
        
        //Prompts the user for a string to convert into shorthand
       System.out.print("Enter a string to be converted into shorthand ");
       System.out.print("(Enter Q or q to quit): ");
       //input = keyboard.readLine();
       
       //test code
       shrthnd = new Shorthand("You can pretend to be serious; you can't pretend to be witty");
       if (shrthnd.newShorthand().equals("U cn prtnd 2 b srs; U cn't prtnd 2 b wtty")) 
            System.out.println("true");
       else 
            System.out.println("false");
       
        //instantiates Shorthand class
//         while (!input.equalsIgnoreCase("q"))
//         {
//             shrthnd = new Shorthand(input);
//             output = shrthnd.newShorthand();
//             System.out.println(output);
//             System.out.println();
//             
//             System.out.print("Enter a string to be converted into shorthand ");
//             System.out.print("(Enter Q or q to quit): ");
//             input = keyboard.readLine();
//         }

    }
}
