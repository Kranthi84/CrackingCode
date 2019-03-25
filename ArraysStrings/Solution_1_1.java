package ArraysStrings;

// Problem 1.1: Implement an algorithm to determine if a string has all the unique characters. What if you cannot use additional datastructures?

public class Solution_1_1
{

  public boolean isTheStringUnique(String str)
  {
  
    // If the character set is ASCII , then the length of character set is 256 .
  
     if(str.length() > 256) 
     {
         return false;
     }
     
     boolean[] char_set = new boolean[256];
     
     for(int i=0; i < str.length(); i++)
     {
      
       if(char_set[str.charAt(i)])
       {
         return false;
        
       }
       char_set[str.charAt(i)] = true;
     
     }
  
  return true;
  
  }


}