import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> buildHashSet(){
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("Manzana");
        myHashSet.add("Pera");
        myHashSet.add("Melocoton");
        myHashSet.add("Mora");
        return myHashSet;
    }

    public Set<String> buildLinkedHashSet(){
        Set<String> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add("Manzana");
        myLinkedHashSet.add("Pera");
        myLinkedHashSet.add("Melocoton");
        myLinkedHashSet.add("Mora");
        return myLinkedHashSet;
    }

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
