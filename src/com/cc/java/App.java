package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29,true); // Klasse --> Objekt / Instanz

        output("Name: " + cat1.getStringAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringAttributes("#color"));

        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());
        output("Alter: " + cat1.getAge());

        output("------------------------");

        Cat cat2 = new Cat("Alonzo", "black", 35,false); // Klasse --> Objekt / Instanz

        output("Name: " + cat2.getStringAttributes("#name"));
        output("Fellfarbe: " + cat2.getStringAttributes("#color"));

        output("Alter: " + cat2.getAge());


       

    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}
