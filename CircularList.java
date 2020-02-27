public class CircularList<E> extends AbstractList<E>{

protected Node<E> tail; 
protected int count;
protected CircularList<E> data;
public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
   data = new Vector<E>();
}

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
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