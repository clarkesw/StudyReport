package com.last.spring.studyreport.oops;

import java.util.*;

public class Demo {

    public static void main(String[] arg) {
        
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Clarke");
        myList.add("Maggie");
        myList.add("Apple");
        myList.add("Pumkin");
        myList.add("Bella");
        myList.add("Maggie");

        Collections.sort(myList, Comparator.naturalOrder());
        System.out.println("myList: " + myList);
    }
}

abstract class Vehicle {
    static String name;
    
    public Vehicle(){}
    
    public Vehicle(String name){
        this.name = name;
    }
    abstract void engineType();
}

class Coupe extends Vehicle{
    public Coupe(){}
    
    public Coupe(String name){
        super(name);
    }
    
    @Override
    public void engineType() {
        System.out.println("V12 Engine!!!");
    }
}

class Sedan extends Vehicle{

    public Sedan(){}
    
    public Sedan(String name) {
        super(name);
    }
    
    @Override
    public void engineType() {
        System.out.println("L4 crap engine.");
    }
}

class Accord extends Sedan {

    public Accord() {
    }

    public Accord(String name) {
        super(name);
    }
    
}
class Corvette extends Coupe {}
class Ferrari extends Coupe {

    public Ferrari() {
    }

    public Ferrari(String name) {
        super(name);
    }
    
}