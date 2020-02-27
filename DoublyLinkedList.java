public class DoublyLinkedList<E> extends DoublyLinkedNode<E>{
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;
protected DoublyLinkedList<E> data;
public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   data = new Vector<E>();
   count = 0;
}


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
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
  public int size()
  // post: returns the number of elements in the stack
  {
    return data.size();
  }
}