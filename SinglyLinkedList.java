public class SinglyLinkedList<E> extends AbstractList<E>
{

   protected int count; // list size
   protected Node<E> head; // ref. to first element
   protected SinglyLinkedList<E> data;
   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
      data = new Vector<E>();
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   public void push(E item)
  // post: the value is added to the stack
  //          will be popped next if no intervening push
  {
    data.add(item);
  }

  public E pop()
  // pre: stack is not empty
  // post: most recently pushed item is removed and returned
  {
    return data.remove(size()-1);
  }

  public E peek()
  // pre: stack is not empty
  // post: top value (next to be popped) is returned
  {
    return data.get(size() - 1);
  }
 

 }
