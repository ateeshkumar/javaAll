package com.company;
class Base extends Exception {
    Base(){
        System.out.println(" constructor Base method");
    }
    void base(){
        System.out.println("Local base method");
    }
}
class Derived extends Base {
    Derived(){
        System.out.println("constructor of Derived method");
    }
    void derived(){
        System.out.println("Local derived methed");
    }
}
public class Level {
    public static void main(String[] args) {
        try {
            throw new Base();
//            throw new Derived();
        }
        catch (Base b){
            System.out.println("base thorws excption!");
        }
//        catch (Derived d){
//            System.out.println("derived Exception");
//        }

    }
}
