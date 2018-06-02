package QE_Training;
import java.util.*;
public class arraylist_class {
    private String input; 
    
    public arraylist_class(String input)
    {
        this.input = input;
    }
    
    public void movetocollection()
    {
        Set<Character> mylist = new HashSet<Character>();
        
        for(int i=0; i<input.length(); i++)
        {
            mylist.add(input.charAt(i));
        }
        
        for(Character c: mylist)
        {
            System.out.println(c);
        }
    }
}
