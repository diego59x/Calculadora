/**
 * @author Diego Alvarez 19498 
 * @author Christian Fernandez 19 
 * Fecha de creacion: 25/02/2020
 * Clase Main
 * En esta se ejecutan las llamdas de los diferentes tipos 
 * de implementaciones.
 */


import java.util.*;
import java.io.*;
public class Main {

   
    public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    // Llamada al factory:
    StackFactory<String> sFactory = new StackFactory<String>();
    ListFactory<String> lFactory = new ListFactory<String>();
    // Se hace empleo de singleton 
    Calculadora calculadora = Calculadora.SingletonInstance();
    System.out.println("¿De que manera desea calcular la expresion?\n 1. ArrayList \n 2. Vector\n 3. CircularList \n 4. Lista simple\n 5. Lista doble");
    String opcion = scan.nextLine();
    IStack<String> miStack = sFactory.getStack(opcion);
    List<String> miLista = lFactory.getList(opcion);
    
    

    
    //  1: implementacion con ArrayList
    //  2: implementacion con Vector
    //  3: Implementacion con Stack
    
    // variables
    String info = "\n";
    int operando1;
    int operando2 ;
    int total = 0;
    boolean bandera = true;
	// se obtiene el documento con la operacion y se almacena en una variable de tipo String
    File f = new File("datos.txt");
    BufferedReader entrada;
    try {
           entrada = new BufferedReader(new FileReader(f));
           while(entrada.ready()){
                info += entrada.readLine() + "\n";
            }
    }catch (IOException e) {
            e.printStackTrace();
	}
          
    
    // se separa el texto ingresado             
    String palabras[]=info.trim().split(" ");
    // se agrega a un arraylist
    for(int i=0;i<palabras.length;i++){
        
        try{
            Integer.parseInt(palabras[i]);
            bandera = true;
        }catch(NumberFormatException excepcion){
            bandera = false;
        }
        
        //while(miStack.empty() != true){
            
        //}
        if (bandera == true){
            miStack.push(palabras[i]);
        }else{
            if("+".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando2 = Integer.parseInt(miStack.pop());
                operando1 = Integer.parseInt(miStack.pop());
                total = calculadora.sumar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if("-".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando2 = Integer.parseInt(miStack.pop());
                operando1 = Integer.parseInt(miStack.pop());
                total = calculadora.restar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if ("/".equals(palabras[i])){
               
                // se obtienen los dos operandos
                operando2 = Integer.parseInt(miStack.pop());
                operando1 = Integer.parseInt(miStack.pop());
                total = calculadora.dividir(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else if ("*".equals(palabras[i])){
                
                // se obtienen los dos operandos
                operando2 = Integer.parseInt(miStack.pop());
                operando1 = Integer.parseInt(miStack.pop());
                total = calculadora.multiplicar(operando1,operando2);
                // se agrega el resultado de la operacion al stack
                miStack.push(String.valueOf(total));
            }else{
                System.out.println("ERROR");
            }
        }
          
    
    
    }
    // Se muestra el resultado y se muestra 
    // con que realizo la operacion
    System.out.println(miStack.mensaje());
    System.out.println(miStack.pop());
    

           
                
                
                
                
    }
    
}
