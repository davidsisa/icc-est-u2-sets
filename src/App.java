import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        runHashSet();
        runLinkedHashSet();  
        runTreeSet();
        runTreeSetComparator();
    }

    public static void runHashSet(){
        Sets sets = new Sets();
        Set<String> exp = sets.buildHashSet();
        System.out.println("---");
        System.out.println("Example Hash Set:");
        for (String element : exp) {
            System.out.println(element);
        }
    }
    public static void runLinkedHashSet(){
        Sets sets = new Sets();
        Set<String> exp = sets.buildLinkedHashSet();
        System.out.println("---");
        System.out.println("Example Linked Hash Set:");
        for (String element : exp) {
            System.out.println(element);
        }
    }
    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> exp = sets.buildTreeSet();
        System.out.println("---");
        System.out.println("Example Tree Hash Set:");
        for (String element : exp) {
            System.out.println(element);
        }
    }
    public static void runTreeSetComparator(){
        Sets sets = new Sets();
        Set<String> exp = sets.buildTreeSetWithComparator();
        System.out.println("---");
        System.out.println("Example Tree Hash Set:");
        for (String element : exp) {
            System.out.println(element);
        }
    }
}
