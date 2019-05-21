public class Solution_2_4
{
   public ListNode partition(ListNode node, int val)
   {
      ListNode beforeStart = null, beforeEnd = null, afterStart = null, afterEnd = null;
      while(node != null)
      {
         ListNode next = node.next;
         if(node.data < val)
         {
            if(beforeStart == null)
            {
               beforeStart = node;
               beforeEnd = beforeStart;
            }else
            {
               beforeEnd.next = node;
               beforeEnd = node;
            }
         }
         else
         {
            if(afterStart == null)
            {
               afterStart = node;
               afterEnd = afterStart;
            }else
            {
               afterEnd.next = node;
               afterEnd = node;
            }
         }
      }
      
      if(beforeStart == null)
         return afterStart;
         
      beforeEnd.next = afterStart;
      return beforeStart;
   }  
}