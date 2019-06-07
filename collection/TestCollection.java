package collection;

import java.util.LinkedList;

import charactor.Hero1;

public class TestCollection {

    public static void main(String[] args) {


        LinkedList<Hero1> ll =new LinkedList<Hero1>();

        //ll.addLast(new Hero1("hero1"));
        //ll.addLast(new Hero1("hero2"));
        //ll.addLast(new Hero1("hero3"));
        System.out.println(ll);


        //ll.addFirst(new Hero1("heroX"));
        System.out.println(ll);


        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());


        System.out.println(ll);

        System.out.println(ll.removeFirst());


        System.out.println(ll.removeLast());


        System.out.println(ll);

    }

}