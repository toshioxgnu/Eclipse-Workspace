/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author scarleth
 */
public class Pila{
    int tope,max;
    String pila[];

public Pila(int m){
    max=m;
    pila=new String[max];
    tope=0; 
}

//Metodo que agrega un dato
private void Agregar(String n){
    if(tope<max){
        pila[tope]=n;
        tope++;
        System.out.println("Dato agregado");
    }
    else{
        System.out.println("Ya no caben mas datos");
    }
}

//Metodo que elimina un dato de la pila
private void Eliminar(){
    if(tope>0){
        tope--;
        System.out.println("Dato eliminado");
    }
    else{
        System.out.println("Ya no hay datos para eliminar");
    }
}

//Metodo que muestra los datos *Ultimo -> Primero*
private void Mostrar(){
    if(!Vacia()){
        System.out.println("PILA: ");
        for(int a=(tope-1);a>=0;a--){
            System.out.print(pila[a]+" ");
        }
        System.out.println("");
    }
    else 
        System.out.println("Pila vacia");
}

//Buscar dato
private boolean Buscar(String dato){
    boolean encontrado=false;
    if(!Vacia()){
        for(int a=(tope-1);a>=0;a--){
            if
                (pila[a].equals(dato)) encontrado=true;
        }
    }
    else 
        System.out.println("No hay datos para buscar en la pila");
    return encontrado;
}

//revisar si esta vacia
private boolean Vacia(){
    if
        (pila==null) return true;
    else 
        return false;
}

public static void main(String arg[]){
    int t, opcion;
    String dato;
    Scanner teclado=new Scanner(System.in);
    System.out.println("---Pilas---");
    System.out.println("Tamaño para la pila: ");
    t=teclado.nextInt();
    Pila pilita=new Pila(t);
    do{
        System.out.println("");
        System.out.println("1. Agregar dato");
        System.out.println("2. Eliminar dato");
        System.out.println("3. Mostrar datos");
        System.out.println("4. Buscar dato");
        System.out.println("5. Salir");
        System.out.println("Que desea hacer? ");
        opcion=teclado.nextInt();
        System.out.println("");
        switch(opcion){
            case 1:
                System.out.println("Escriba un dato: ");
                dato=teclado.next();
                pilita.Agregar(dato);
                break;
            case 2:
                pilita.Eliminar();
                break;
            case 3:
                pilita.Mostrar();
                break;
            case 4:
                System.out.println("Dato a buscar: ");
                dato=teclado.next();
                if(pilita.Buscar(dato)) 
                    System.out.println("Dato encontrado");
                else 
                    System.out.println("Dato no encontrado");
                break;
        }
    }while(opcion!=5);
}
}

