package main;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
//Metodo que crea un HashSet, el cual, no garantiza el orden de entrada
    public Set<String> buildHashSet(){
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("Manzana");
        myHashSet.add("Pera");
        myHashSet.add("Melocoton");
        myHashSet.add("Mora");
        return myHashSet;
    }
//Metodo que crea un LinkedHashSet, el cual, respeta el orden de entrada.
    public Set<String> buildLinkedHashSet(){
        Set<String> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add("Manzana");
        myLinkedHashSet.add("Pera");
        myLinkedHashSet.add("Melocoton");
        myLinkedHashSet.add("Mora");
        return myLinkedHashSet;
    }
    //Metodo que crea un TreeSet, el cual ordena naturalmente la entrada.
    public  Set<String> buildTreeSet(){
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("Manzana");
        myTreeSet.add("Pera");
        myTreeSet.add("Melocoton");
        myTreeSet.add("Mora");
        return myTreeSet;
    }
    /**
     * @return
     */
    //Metodo que ordena las entradas por longitud, y luego por orden alfabetico
    public Set<String> buildTreeSetWithComparator(){
        Comparator<String> comparator = new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                int result = Integer.compare(o1.length(),o2.length());
                if(result == 0){
                    result = o1.compareTo(o2);
                }
                return result;
            }
        };
        Set<String>  myTreeSetComparator = new TreeSet<>(comparator); 
        myTreeSetComparator.add("Melon");
        myTreeSetComparator.add("Pera");
        myTreeSetComparator.add("Manzana");
        myTreeSetComparator.add("Fresa ");
        myTreeSetComparator.add("Kiwi");
        myTreeSetComparator.add("Melocoton");
        myTreeSetComparator.add("Pera");
        return myTreeSetComparator;
    }
}
