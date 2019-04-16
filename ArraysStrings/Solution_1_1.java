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
  
  
  // We can reduce the space size by 8 , by using bits
  
  public boolean isTheStringUnique2(String str)
  {
      // Assumption is that all the characters are lower case and they are between a to z
      
      int verifier = 0;
      
      for(int i=0; i<str.length();i++){
         
         int value = str.charAt(i) - 'a';
         // if the character at i already exists , then the logical and with verifier bit would give a value greater than 0.
         if((verifier & (1 << value))> 0)
             return false;
         // If the character at i is unique, or the first appearance, then verifier is updated with the character at i. So next time when the same character appears, the logical and would result in a zero.
         verifier |= (1 << str.charAt(i));    
      
      }
      
      return true;
  }
}