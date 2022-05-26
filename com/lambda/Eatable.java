package com.lambda;

public interface Eatable {
    public String eatIT(String eat);
}
class TestEatable{
    public static void main(String[] args) {

        Eatable eatable=(eat)->{
            return "you can eat the " +eat;
        };
        System.out.println(eatable.eatIT("Gulabjamun"));
    }
}
