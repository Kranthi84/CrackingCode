public class Solution_1_8
{
   public int[][] nullifyTheMatrix(int[][] matrix)
   {
      boolean rowHasZero = false, columnHasZero = false;
      for(int i=0; i < matrix[0].length; i++)
      {
         if(matrix[0][i] == 0)   
         {
            rowHasZero = true;
            break;
         }      
      }
      
      for(int i = 0; i < matrix.length; i++)
      {
         if(matrix[i][0] == 0)
         {
            columnHasZero = true;
            break;
         }      
      }
      
      for(int i = 1; i < matrix.length; i++)
      {
        for(int j = 1; j < matrix[0].length; j++)
        {
          if(matrix[i][j] == 0)
          {
            matrix[0][j] = 0;
            matrix[i][0] = 0;
          
          }
        }
      }
      
      for(int i = 0; i < matrix.length; i++)
      {
         if(matrix[i][0] == 0)
         {
            updateRowMatrix(matrix, i);
         }   
      }
      
      for(int i = 0; i < matrix[0].length; i++)
      {
         if(matrix[0][i] == 0)
         {
            updateColumnMatrix(matrix, i);
         }
      }
      
      if(rowHasZero)
      {
         updateRowMatrix(matrix, 0);
      }
      
      if(columnHasZero)
      {
         updateColumnMatrix(matrix, 0);
      }
      
      
   }
   
   
   public void updateRowMatrix(int[][] matrix,int i)
   {
      for(int j = 0; j < matrix[0].length; j++)
      {
         matrix[i][j] = 0;
      }
   }
   
   public void updateColumnMatrix(int[][] matrix, int i)
   {
      for(int j = 0; j < matrix.length; j++)
      {
         matrix[j][i] = 0;
      }
   }

}