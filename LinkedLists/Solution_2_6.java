class Solution_2_6
{
   boolean isPalindrome(ListNode head)
   {
      // Reverse the list and compare the list with the actual list.
      ListNode reverseHead = reverseTheList(head);
      return isEqual(head, reverseHead);
   }
   
   ListNode reverseTheList(ListNode n)
   {
      ListNode head = null;
      
      while(n != null)
      {
         ListNode node = new ListNode(n.data);
         node.next = head;
         head = node;
         n = n.next;         
      }
      
      return head;
   }
   
   boolean isEqual(ListNode first, ListNode second)
   {
      while(first != null && second != null)
      {
         if(first.data != second.data)
            return false;
         
         first = first.next;
         second = second.next;
      }
      
      return first == null && second == null;
   }
   
   // Iterative Approach
   boolean isPalindromeIteratively(ListNode head)
   {
      ListNode fastNode = head;
      ListNode slowNode = head;
      
      Stack<Integer> mStack = new Stack<Integer>();
      
      while(fastNode != null && fastNode.next != null)
      {
         mStack.push(slowNode.data);
         slowNode = slowNode.next;
         fastNode = fastNode.next.next;
      }
      
      if(fastNode != null)
         slowNode = slowNode.next;
      
      while(slowNode != null)
      {
         int stackValue = mStack.pop().intValue();
         
         if(slowNode.data != stackValue)
            return false;
         
         slowNode = slowNode.next;   
      }
      
      return true;   
   }
   
   // This method validates if a string is palindrome, using recursive.
   
   // Create a class to hold the result.
   public class Result
   {
      ListNode resNode;
      boolean matches;
   }
   
   boolean isPalindromeRecursive(ListNode head)
   {
      int length = lengthOfList(head);
      Result res = isPalindrome(head, length);
      return result.matches;
      
   }
   
   int lengthOfList(ListNode n)
   {
      int size = 0;
      while(n != null)
      {
         size++;
         n = n.next;
      }
      
      return size;
   }
   
}