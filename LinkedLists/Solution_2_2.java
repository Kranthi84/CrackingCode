public class Solution_2_2
{
   int kthNodeFromLast(ListNode head,int k)
   {
      if(head == null)
      {
         return 0;
      }
      
      int index = kthNodeFromLast(head.next,k)+1;
      if(index == k)
      {
         System.out.println("The "+k+"th element from the last is "+head.data);
      }
      
      return index;
   }
   
   ListNode kthNodeToLast(ListNode head, int k)
   {
      Index idx = new Index();
      return returnKthNode(head, idx,k);
      
   }

   ListNode returnKthNode(ListNode head, Index idx, int k)
   {
      if(head == null)
      {
         return null;
      }
      
      ListNode node = returnKthNode(head.next, idx, k);
      idx.value = idx.value + 1;
      
      if(k == idx.value)
      {
         return head;
      }
      
      return node;
      
   }
   
class Index
   {
      int value = 0;
   }
   
}