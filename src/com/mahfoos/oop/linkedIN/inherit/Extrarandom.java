package com.mahfoos.oop.linkedIN.inherit;

import java.util.Random;

public class Extrarandom extends Random {

    public String nextLetter(){
        int aAsInt = (int) 'a';  // ASCII value of a =97
        int letterStartAt = 97;
        int randomInt = new Random().nextInt(26) + letterStartAt;
        return "" + (char)randomInt;
    }
}
