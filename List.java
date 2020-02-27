public interface List<E>{

   
   public void addLast(E value);//
   // post: value is added to end of list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list

   public E removeLast();//
   // pre: list is not empty
   // post: removes last value from list

   

}