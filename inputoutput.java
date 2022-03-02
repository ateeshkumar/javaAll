package com.company;

import java.io.Reader;

class input{
    void over(){
        System.out.println("this is normal method");
    }
    void over(String s){
        System.out.println("this is a overloading");
    }
}
class output extends input{
    @Override
    void over() {
        System.out.println("sdfgh  erj rttyu");
    }
}
public class inputoutput {
    public static void main(String[] args) {
        output ou = new output();
        ou.over();

    }
}
