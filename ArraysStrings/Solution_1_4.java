package ArraysStrings;

public class Solution_1_4
{
  public boolean isThePermuationaPalindrome(String str)
  {
  
    int[] characterTable = getCharactersCount(str);
    return checkTheOddCount(characterTable);
  
  } 
  
  // This one using bit vector
  public boolean isThePermuatationPalindrome2(String str)
  {
    int bitVector = 0;
    for(char c: str.toCharArray())
    {
       bitVector = returnBitVector(bitVector, c);
       
    }
    
    return bitVector == 0||isOnlyOneCharacterOdd(bitVector);
    
  }
  
  private boolean checkTheOddCount(int[] table)
  {
    int foundOdd = false;
    
    for(int count: table)
    {
     
      if((count % 2) == 1)
      {
         if(foundOdd)
           return false;
        
         foundOdd = true;
      }
    }
   
    return true;
  }
  
  // Map characters of each string with the # of occurences of the particular character. Assume the characters are all lower case, initialize the array withe size of the lower case alphabets.
  private int[] getCharactersCount(String str)
  {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
    
    for(char c: str.toCharArray())
    {
      int numeric_c = getNumericCharacter(c);
      
      if(numeric_c != -1){
      
         table[numeric_c]++;   
       }
    }
  
    return table;
  
  }
  
  // Return character in reference to the int value of first character 'a'
  private int getNumericCharacter(char c)
  {
      int a = Character.getNumericValue('a');
      int z = Character.getNumericValue('z');
      
      int val = Character.getNumericValue(c);
      
      if(val >= a && val <= z)
      {
        return val - a;
       
      }
      
      return -1;
       
  
  }
  
  // Returns a bit vector, with 1 indicating that the character has occurred odd # of times and 0 indicating that the character has occurred even # of times.
  
  private int returnBitVector(int bitVector, char c)
  {
  
    int c = getNumericCharacter(c);
    
    int mask = 1 << c;
    
    if(bitVector & mask == 0)
         bitVector |= mask;
    else
         bitVector &= ~mask; 
         
    return bitVector;
  }
  
  
  // Need to find out if atmost only one character is odd.
  
  private boolean isOnlyOneCharacterOdd(int bitVector)
  {
    // Substract 1 , then and with the same number.
    return (bitVector & (bitVector - 1) == 0);
    
  }

}