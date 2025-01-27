package main;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.ObjDoubleConsumer;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        
        //runHashSet();
        //runLinkedHashSet();  
        //runTreeSet();
        //runTreeSetComparator();
        runEjercicio();
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
        System.out.println("Example Tree Hash Set With Comparator:");
        for (String element : exp) {
            System.out.println(element);
        }
    }
    public static void runEjercicio(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        /* 
        Contacto c1 = new Contacto ("Pedro","Lopez","123456789");
        Contacto c2 = new Contacto ("Pedro","Lopez","123456789");
        */
        Contacto c1 = new Contacto ("Pedro","Lopez","2222222");
        Contacto c2 = new Contacto ("Luis","Perez","983412452");
        Contacto c3 = new Contacto ("Ana","Perez","111111111");

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);
        for (Contacto element : agenda) {
            System.out.println(element + " ");
        }

    }
}
