package com.kenzie.app;
import java.util.Random;
public class Dice {
    //define class variables here
    public int die1;
    public int die2;

    //define class methods here

    //roll() method will generate random numbers 1-6 for each dice
    public void roll(){
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
        //return type is void
    }

    //getTotal()
    public int getTotal(){
        //return the sum of both die values as int when called. between 2 and 12.
        return die1 + die2;
    }

    //getDice1() getter method that returns the value of the first die
    public int getDice1(){
        return die1;
    }

    //getDice2() getter method that returns the value of the second die
    public int getDice2(){
        return die2;

    }
    Random random = new Random();


}
