package com.company;

public class Main {
    static String dog;

    public Main(String dog) {
        Main.dog = dog;
//        this.dog = dog;
    }

    public static void main(String[] args) {
        Main rv = new Main("tomy");
        Main arv = new Main("puppy");
        System.out.println("dog name is "+ dog);//or rv.dog
        System.out.println("dog name is "+ dog);//or arv.dog

//        if we access dog as a instance variable then the output would be
//        dog name is tomy
//        dog name is puppy
    }
}
