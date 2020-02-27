class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public IStack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
		if (entry.equals("1"))
      		return new StackArrayList<E>(); //regresa ArrayList
		else if(entry.equals("2"))
      		return new StackVector<E>(); //regresa Vector
		return null;
	}
   
}