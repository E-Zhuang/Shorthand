
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
        
        String input, deltaInput, output;
        
        //Prompts the user for a string to convert into shorthand
        System.out.print("Enter a string to be converted into shorthand ");
        System.out.print("(Enter Q or q to quit): ");
        input = keyboard.readLine();
        
        //converts the string to all lowercase and instantiates Shorthand class
        deltaInput = input.toLowerCase();
        shrthnd = new Shorthand(deltaInput);
        output = shrthnd.toShorthand();
        System.out.println(output);
        
        
        

    }
}
