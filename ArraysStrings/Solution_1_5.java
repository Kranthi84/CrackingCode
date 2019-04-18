package ArraysStrings;

import java.util.*;

public class Solution_1_5
{
  public boolean isOneEditReplaceInsert(String first, String second)
  {
      // If the difference between the lengths of both the strings is greater than 1, then return false.
      if(Math.abs(first.length() - second.length()) > 1)
            return false;
      
      // Always make the s1 the string with shorter length
      String s1 = first.legnth() < second.length()? first: second;
      
      // Always make the s2 the string with longer length
      String s2 = second.length() > first.length() ? second: first;
      
      int index1 = 0;
      int index2 = 0;
      boolean found = false;
      
      // loop until s2 and s1 length reaches
      while(index2 < s2.length() && index1 < s1.length())
      {
         // If the characters won't match, then update bool "found" to true, if it is more than one instance then return false.
         
         if(s1.charAt(index1) != s2.charAt(index2)
         {
           if(found)
             return false;
           found = true;
           // If the length of the strings match then update index1 and index2 both. Other wise update only index2
           if(s1.length() == s2.length())
              index1++;
         }
         else
         {
            index1++;
         }
         
         index2++;
      
      }
      
      return true;
       
  }


}