
/**
 * Write a description of class Shorthand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Shorthand
{
    private String input, newIn;
    private int length;
    
    public Shorthand(String input)
    {
        input = input;
        newIn = " " + input + " ";
        length = newIn.length();
    }
    
    public String toShorthand()
    {
        String first, last;
        int search;
        
        search = newIn.indexOf(" and ");
        while (search != -1)
        {
            first = newIn.substring(0, search + 1);
            last = newIn.substring(search + 4, newIn.length());
            newIn = first + "&" + last;
            search = newIn.indexOf(" and ");
        }
        
        search = newIn.indexOf(" for ");
        while (search != -1)
        {
            first = newIn.substring(0, search + 1);
            last = newIn.substring(search + 4, newIn.length());
            newIn = first + "4" + last;
            search = newIn.indexOf(" for ");
        }
        
        search = newIn.indexOf(" you ");
        while (search != -1)
        {
            first = newIn.substring(0, search + 1);
            last = newIn.substring(search + 4, newIn.length());
            newIn = first + "U" + last;
            search = newIn.indexOf(" you ");
        }
        
        search = newIn.indexOf(" to ");
        while (search != -1)
        {
            first = newIn.substring(0, search + 1);
            last = newIn.substring(search + 3, newIn.length());
            newIn = first + "2" + last;
            search = newIn.indexOf(" to ");
        }
        
        removeAll("aeiou");
        
        return newIn;
    }
        
    
    
    public void removeAll(String input)
    {
        String in = input, test;
        int characters;
            
        for (int many = 0; many < in.length(); many++)
        {
            // instantiates an empty string and fills it with a punctuation mark
            test = "";
            test += in.charAt(many);
                
            // tests to see if there is a punctuation mark of type "many"
            characters = newIn.indexOf(test);
            // removes the punctuation mark as long as there is one
            while (characters != -1)
            {
                length = newIn.length(); 
                newIn = newIn.substring (0, characters) + newIn.substring ((characters + 1), (length));
                characters = newIn.indexOf(test);
            }
        }
        
    }
}
