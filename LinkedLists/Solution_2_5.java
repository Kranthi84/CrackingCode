public class Solution_2_5
{
   // The lists hold the numbers in reverse order.
   // This implementation includes the result to the tail of the list node.
   public ListNode addLists(ListNode L1, ListNode L2, int carry)
   {
    if(L1 == null && L2 == null && carry == 0)
    {
      return null;
    }
    
    // Listnode to hold the result.
    
    ListNode resultNode = new ListNode();
    
    // Local variable to hold carry value.
    int value = carry;
    
    if(L1 != null)
    {
      value += L1.data;
    }
    
    if(L2 != null)
    {
      value += L2.data;
    }
    
    resultNode.data = value % 10;
    
    if(L1 != null || L2 != null)
    {
      ListNode more = addLists( L1 == null ? null : L1.next, L2 == null ? null : L2.next, value >= 10 ? 1 : 0);
      resultNode.next(more);
    }
    
    return resultNode;  
 }
   
   
   // For the below implementation, the numbers are stored in lists - in a straight order, not the reverse order.
   public ListNode addListsStraightOrder(ListNode l1, ListNode l2)
   {
      if(l1 == null && l2 == null)
      {
         return null;
      }
      
      int length1 = length(l1);
      int length2 = length(l2);
      
      if(length1 < length 2)
      {
         l1 = paddingList(l1,length2 - length1);   
      }
      else
      {
         l2 = paddingList(l2, length1 - length2);
      }
      
      PartialSum sum = addListHelper(l1,l2);
      
      if(sum.carry == 0)
      {
         return sum.sumNode;
      }
      else
      {
         ListNode resultNode = insertBefore(sum,sum.carry);
         return resultNode;  
      }
      
      public PartialSum addListHelper(ListNode l1, ListNode l2)
      {
         if(l1 == null && l2 == null)
         {
            PartialSum sum = new PartialSum();
            return sum;
         }
         
         PartialSum sum = addListHelper(l1.next, l2.next);
         
         int val = l1.data + l2.data + sum.carry;
         
         ListNode full_result = insertBefore(sum.sumNode, val % 10);
         
         sum.sumNode = full_result;
         sum.carry = val / 10;
         return sum;     
      }
      
      
      public ListNode insertBefore(ListNode listnode, int data)
      {
         ListNode newNode = new ListNode(data);
         if(listnode != null)
         {
            newNode.next = listnode;
         }
         
         return newNode;
      }
      
      public ListNode paddingList(ListNode listnode,int len)
      {
         ListNode paddedNode = null;
         
         for(int i=0; i < len; i++)
         {
            paddedNode = insertBefore(listnode, 0);
         }
         return paddedNode;
      }
   }


   public class PartialSum
   {
      ListNode sumNode = null;
      int carry = 0;   
   }

}