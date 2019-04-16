package ArraysStrings;

public class Solution_1_3
{

public String replaceSpaces(char[] str, int actualLength)
{
   int spaceCount , index, i;
   
   // Count the number of spaces from the beginning of the array.
   for( i = 0;i < actualLength; i++)
   {
      if(str[i] == ' ')
         spaceCount++;
   }
   
   
   // Place the index at the last position, including the additional spaces required to accomodate %20 on each preceding space.
   index = actualLength + spaceCount * 2;
   
   if(actualLength < str.length)
       str[actualLength] = '\0';
   
   for(int j = actualLength - 1; j >=0; j--)
   {
      // If the character is a space, then replace it with %20
      if(str[j] == ' ')
      {
         str[index - 1] = '0';
         str[index - 2] = '2';
         str[index - 3] = '%';
         
         index = index - 3;
      
      }else
      {
       //If the character is not a space, then replace the index position with the actual character found in the array at position j.
        str[index - 1] = str[j];
        index --;
      
      }
   
   
   }

 return new String(str);
}


}