public class Solution_1_7
{
 
   public boolean rotateMatrix(int[][] matrix)
   {
      if(matrix.length == 0 || (matrix.length != matrix[0].length))
      {
         return false;
      
      }
      
      int n = matrix.length;
      
      for(int layer = 0; layer < n/2; ++layer)
      {
          int first = layer;
          
          int last = n - 1 - layer;
          
          for(int i = first; i < last; ++i)
          {
            int offset = i - first;
            
            // The top item in the matrix
            int top = matrix[first][i];
            
            // Move the left most to the top element
            matrix[first][i] = matrix[last - offset][first];
            
            // Move the bottom to left
            matrix[last - offset][first] = matrix[last][last - offset];
            
            // Move the right to bottom
            
            matrix[last][last - offset] = matrix[i][last];
            
            // move the top to the right position
            
            matrix[i][last] = top;
            
            
            
          
          }  
      
      
      }


   }
}