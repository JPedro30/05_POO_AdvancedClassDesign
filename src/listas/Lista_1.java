package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

import modelo.Bicicleta;
import modelo.Persona;

public class Lista_1 {

    public Lista_1(){

    Persona p1 = new Persona("Pedro","Gonzalez","303030");
    Persona p2 = new Persona("Marcos","Muñoz","505050");
    Persona p3 = new Persona("Arturo","Pinto","202020");

    Bicicleta b1 = new Bicicleta(11,29);


    // INTERFAZ COLLECTION
    System.out.println("\nINTERFAZ COLECCTION\n");
    Collection lista1 = new ArrayList<>();
    lista1.add(p1);
    lista1.add(p2);
    lista1.add(p3);
    lista1.add(b1);

    for (Object elem : lista1) {
        //if (elem instanceof Persona) // esto comprueba si el objeto es una instancia de la clase Persona
        System.out.println("Persona : "+elem);
    }


    // INTERFAZ LISTA
    System.out.println("\nINTERFAZ LISTA\n");
    List<Persona> lista2=null;
    lista2 = new ArrayList<Persona>();
    lista2.add(p1);
    lista2.add(p2);
    lista2.add(p3);
    //lista2.add(b1); no se puede ya que es una lista de Persona y b1 es un objeto de Bicicleta
    lista2.set(0, p3);
    for (Persona persona : lista2) {
        System.out.println(persona);
    }
    Persona p4;
    p4 = lista2.get(0);
    System.out.println("El primer elemento es p4: "+p4);
    System.out.println("BORRAR");
    Persona p = lista2.remove(0); // con indice
    System.out.println("Hemos borrado p: "+p);
    for (Persona persona : lista2) {
        System.out.println(persona);
    }
    System.out.println("Hemos borrado p3: "+p3);
    lista2.remove(p3); // con el objeto directamente
    for (Persona persona : lista2) {
        System.out.println(persona);
    }


    // ITERATOR (REVISAR NO LO ENTIENDO)
    Iterator<Persona> iter=lista2.iterator();
    System.out.println("CLASE ITERATOR");
    while (iter.hasNext()) {
        //Persona p5 = iter.next();
        System.out.println(iter.next().toString());
    }


    // OTRO METODO PARA MOSTRAR LISTAS CON FOR

    System.out.println("Mostrar lista con for");
    for (int i = 0; i < lista2.size(); i++) {
        p = lista2.get(i);
        System.out.println(p);
    }


    // OTROS METODOS

    // void clear(); boolean   isEmpty();   boolean   contains(object o);
    //int indexOf(Object o);
    System.out.println(lista2.isEmpty());
    System.out.println(lista2.indexOf(p2));
    System.out.println(lista2.contains(p2));


    }

}
