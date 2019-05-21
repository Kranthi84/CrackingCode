public class Solution_2_1
{
  // Using a buffer HashSet .
  
  public void deleteDups(ListNode n)
  {
      ListNode previous = null;
      HashSet<Integer> set = new HashSet<>();
      
      while(n != null)
      {
         if(set.contains(n.data)
         {
            previous.next = n.next;   
         }
         else
         {
            set.add(n.data);
            previous = n;     
         }
         
         n = n.next;
      }
  }

  // Delete duplicates - with out the buffer
  
  public void deleteDuplicates(ListNode head)
  {
      ListNode current = head;
   
      while (current ! = null)
      {
         ListNode runner = current;
         while(runner != null)
         {
            if(runner.next.data == current.data)
            {
               runner.next = runner.next.next;
            }
            else
            {
               runner = runner.next;
            }
         }
         
         current = current.next; 
      }
  }
}