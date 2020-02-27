class ListFactory<E> {
//selecciona la implementacion a utilizar para una lista
//se utiliza el patron Factory

   public IStack<E> getList(String entry) {
    // seleccion de la implementacion a utilizar:
		if (entry.equals("3")){
	      return new CircularList<E>(); //regresa circularlist
		}else if(entry.equals("4")){
	      return new SinglyLinkedList<E>(); //regresa lista simplle
		}else if (entry.equals("5")){
		  return new DoublyLinkedList<E>(); //regresa lista simplle
		}else{
			return null;  //regresa null
		}
    }
}