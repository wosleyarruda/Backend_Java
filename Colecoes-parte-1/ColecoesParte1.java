package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte1 {
	
	public static void main(String args[]) {
        ListaEntrada();
        ListaOrdenada();
     }

    private static void ListaEntrada() {
        System.out.println("****** Lista Sem Ordenação ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Kiwi");
        lista.add("Manga");
        lista.add("Banana");
        lista.add("Aubergine");
        lista.add("Strawberry");
        System.out.println(lista);
        System.out.println(""); 
 
    }
    

    private static void ListaOrdenada() {
        System.out.println("****** Lista Ordenada ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Kiwi");
        lista.add("Manga");
        lista.add("Banana");
        lista.add("Aubergine");
        lista.add("Strawberry");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(""); 
     
    } 


}
