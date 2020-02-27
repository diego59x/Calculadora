abstract public class AbstractList<E>
       implements List<E>, IStack<E>
{
   public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  

}