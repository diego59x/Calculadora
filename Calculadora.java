/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Diego Alvarez
 */
public class Calculadora implements iCalculadora{
    int resultado;
    private static Calculadora miCalculadora;
    
    public static Calculadora SingletonInstance(){
        if (miCalculadora == null){
            miCalculadora = new Calculadora();
        }
        return miCalculadora;
    }
    
    private Calculadora(){
   
    }
    
    public int sumar(int operando1, int operando2){
        resultado = operando1 + operando2;  
        return resultado;
    }
    
    public int restar(int operando1, int operando2){
        resultado = operando1 - operando2;  
        return resultado;
    }
    
    public int multiplicar(int operando1, int operando2){
        resultado = operando1 * operando2;  
        return resultado;
    }
    
    public int dividir(int operando1, int operando2){
        resultado = operando1 / operando2;  
        return resultado;
    }
    
}
