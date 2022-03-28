
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Pilas {

    public static void main(String[] args) {
    // Se creara la pila 
    Stack<Integer> pila = new Stack<Integer>();
    // Agregar elementos a la pila que serán números primos menores a 15
    //Eliminar el último número agregado
    //Buscar el número primo 7
    //Mostrar el último número primo 
    //Vaciar la pila
    pila.push(2);//5
    pila.push(3);//4
    pila.push(5);//3
    pila.push(7);//2
    pila.push(11);//1
    pila.push(13);//0
    System.out.println("Los elementos de la pila son:" +pila);
    
    //Se eliminará el último elemento agregado
    pila.pop();
    System.out.println("La pila sin el útimo número primo es:" +pila);
    
    //Se buscara un elemento de la pila a través del índice
    System.out.println("El número primo 7 está en el índice:" +pila.search(7));
    
    //Se mostrará el último elemento de la pila
    System.out.println("El último número primo agregado es:" +pila.peek());
    
    //Vaciar la pila
    boolean x=!pila.empty();
    System.out.println("¿La pila está vacía ?:" +x);
    }
    
}
