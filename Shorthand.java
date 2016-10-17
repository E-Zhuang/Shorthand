
/**
 * Write a description of class Shorthand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Shorthand
{
    private String input, newIn, tag;
    private int length, nextTagIndex;
    
    public Shorthand(String in)
    {
        input = in;
        length = input.length();
        nextTagIndex = 0;
        tag = "";
    }
    
    public void removeAll(String remove)
    {
        String in, test;
        int characters, length;
            
        in = remove;
        
        for (int many = 0; many < in.length(); many++)
        {
            // instantiates an empty string and fills it with a character
            test = "";
            test += in.charAt(many);
                
            // tests to see if there is a punctuation mark of type "test"
            characters = tag.indexOf(test);
            // removes the punctuation mark as long as there is one
            while (characters != -1)
            {
                length = tag.length(); 
                tag = tag.substring (0, characters) + tag.substring ((characters + 1), (length));
                characters = tag.indexOf(test);
            }
        }
        
    }
        
    public String getNextTag()
    {
        String nextTag = "";
        char letter;
        int offset;
        
        offset = 0;
        
        if (nextTagIndex < input.length())
        {
            letter = input.charAt(nextTagIndex + offset);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
            {
                while ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
                {
                    nextTag += letter;
                    offset++;
                    
                    //checks if the character is in the string  
                    if((nextTagIndex + offset) < input.length())
                    {
                        letter = input.charAt(nextTagIndex + offset);
                    }
                    //if the character is not part of the string (at the end), then letter = 0
                    //which breaks the loop
                    else
                        letter = 0;
                        
                }

                nextTagIndex += offset;
            }
            else
            {
                nextTag += letter;
                nextTagIndex++;
            }
        }
        
        return nextTag;
    }
    
    public String newShorthand()
    {
        String output;
        
        output = "";
        
        tag = getNextTag();
        
        while (tag != "")
        {   
            
            if (tag.equalsIgnoreCase("for"))
                    output += '4';
            else
            {
                if (tag.equalsIgnoreCase("and"))
                    output += '&';
                else
                {
                    if (tag.equalsIgnoreCase("to"))
                        output += '2';
                    else 
                    {
                        if (tag.equalsIgnoreCase("you"))
                            output += 'U';
                        else
                        {
                            removeAll("aeiouAEIOU");
                            output += tag;
                        }
                    }
                }
            }
            
            tag = getNextTag();
        }
        
        return output;
    }

}
