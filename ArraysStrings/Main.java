package ArraysStrings;
import java.io.*;

public class Main
{

  public static void main(String[] args) throws IOException
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String line = "";
     
     while((line = br.readLine()) != null)
     {
       Solution_1_1 sol = new Solution_1_1();
      
       System.out.print(sol.isTheStringUnique(line));
        
     
     }
  
  }

}