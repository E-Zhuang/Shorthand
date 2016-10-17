
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
            if (!tag.equalsIgnoreCase("for") && !tag.equalsIgnoreCase("and") && 
                !tag.equalsIgnoreCase("to") && !tag.equalsIgnoreCase("you"))
            {
                removeAll("aeiouAEIOU");
                output += tag;
            }
            else
            {
                if (tag.equalsIgnoreCase("for"))
                    output += '4';
                if (tag.equalsIgnoreCase("and"))
                    output += '&';
                if (tag.equalsIgnoreCase("to"))
                    output += '2';
                if (tag.equalsIgnoreCase("you"))
                    output += 'U';
            }    
            
            tag = getNextTag();
        }
        
        return output;
    }
    
    public String newToShortHand()
    {
        String shorthand = "";
        char character1, character2, character3;
        
        for (int letter = 0; letter < input.length(); letter++)
        {
            character1 = input.charAt(letter);
            if (character1 == 'f' || character1 == 'F')
            {
                character2 = input.charAt(letter + 1);
                if (character2 == 'o' || character2 == 'O')
                {
                    character3 = input.charAt(letter + 2);
                    if (character3 == 'r' || character3 == 'R')
                    {
                        shorthand += '4';
                    }
                    else
                    {
                        shorthand += character1 + character2 + character3;
                    }
                }
                else
                    shorthand += character1 +character2;
            }
            else
                shorthand += character1;
                
            if (character1 == 'a' || character1 == 'A')
            {
                letter++;
                character2 = input.charAt(letter);
                if (character2 == 'n' || character2 == 'N')
                {
                    letter++;
                    character3 = input.charAt(letter);
                    if (character3 == 'd' || character3 == 'D')
                    {
                        shorthand += '&';
                        letter++;
                    }
                    else
                    {
                        shorthand += character1 + character2 + character3;
                        letter++;
                    }
                }
                else
                    shorthand += character1 +character2;
            }
            else
                shorthand += character1;
        
        
            if (character1 == 'y' || character1 == 'Y')
                {
                    letter++;
                    character2 = input.charAt(letter);
                    if (character2 == 'o' || character2 == 'O')
                    {
                        letter++;
                        character3 = input.charAt(letter);
                        if (character3 == 'u' || character3 == 'U')
                        {
                            shorthand += 'U';
                            letter++;
                        }
                        else
                        {
                            shorthand += character1 + character2 + character3;
                            letter++;
                        }
                    }
                    else
                        shorthand += character1 +character2;
                }
                else
                    shorthand += character1;
                    
            if (character1 == 't' || character1 == 'T')
                {
                    letter++;
                    character2 = input.charAt(letter);
                    if (character2 == 'o' || character2 == 'O')
                    {
                        letter++; 
                        shorthand += '2';
                    }
                    else
                    {
                        shorthand += character1 +character2;
                        letter++;
                    }
                }
                else
                    shorthand += character1;
                    
        }
        
        return shorthand;
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

}
