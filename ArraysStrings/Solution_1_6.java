package ArraysStrings;

public class Solution_1_6
{
      public String getCompressedString(String str)
      {
         String compressedString = "";
         int count = 0;
         for(int i=0; i < str.length(); i++)
         {
            count++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1))
            {
               compressedString += str.charAt(i) + count; 
               count = 0;
            }
         }
         
         return compressedString.length() < str.length() ? compressedString : str;
      }
      
      // Using StringBuilder
      
      public String getCompressedString(String str)
      {
         StringBuilder compressedBuilder = new StringBuilder();
         int count = 0;
         for(int i = 0; i < str.length(); i++)
         {
            count++;
            if( i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1))
            {
               compressedBuilder.append(str.charAt(i));
               compressedBuilder.append(count);
               count = 0;
            }
         }
         String compressedString = compressedBuilder.toString();
         return compressedString.length() < str.length()? compressedString: str;
      }
}