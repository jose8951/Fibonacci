/*
 * mostrar un listado de los 30 primeros numeros fibonacci 
   meidante la utilizacion de un for
 */
package ejerciciofibonacci;


public class EjercicioFibonacci {
    
    public static int fib(int n){
        if(n<2)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
      //ystem.out.println("el fib(7) " + fib(7));
      
        for (int i = 0; i < 30; i++) {
            System.out.println("el fib("+i+") " +fib(i));
        }
    }
    
}
