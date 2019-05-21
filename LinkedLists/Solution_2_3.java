public class Solution_2_3
{

   public boolean deleteMiddleNode(ListNode midNode)
   {
      if(midNode == null || midNode.next == null)
         return false; 
         
      ListNode next = midNode.next;
      midNode.data = next.data;
      midNode.next = next.next;
      return true;            
   }
}