package ArrayStrings;

public class Solution_1_2{

   public boolean isTherePermuation(String s1,String s2)
   {
     // If the strings lengths are different then the strings are not permutation with each other.
     
     if(s1.length() != s2.length())
        return false;
    
    // Sort two strings and compare to identify if the two strings are in permuatation. Assumption is that the string comparison is case sensitive and the space is considered for the comparison.
    s1 = sort(s1);
    s2 = sort(s2);
    
    return (s1.equals(s1));
     
    }
    
    public String sortStrings(String s)
    {
      char[] charset = s.toCharArray();
      java.util.Arrays.sort(charset);
      return new String(charset);
      
     }
     
     
     
     // Much efficient method.
     public boolean isTherePermutation(String s1, String s2)
     {
     
       if(s1.length() != s2.length())
          return false;
       
       // The assumption that the strings are ASCII and not extended ASCII
       int[] letters = new int[128];
       
       
       for(int i=0; i < s1.length(); i++)
       {
         int c = (int)s1.charAt(i);
         
         // Increase the count in the letters array, at the position of the character from the string s1
         letters[c]++;
       
       } 
      
       for(int i=0; i < s2.length(); i++)
       {
         int c = (int)s2.charAt(i);
         // Decrease the count in the letters array, at the position of the character i from the string s2
         letters[c]--;
         
         // If the value at the postion of character i, in letters array is a negative value, then the strings are not in permuation.
         if(letters[c] < 0)
          return false;
        }
        
        return true;
     
     }


}