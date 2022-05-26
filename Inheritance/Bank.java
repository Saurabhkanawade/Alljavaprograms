package Inheritance;

public class Bank {

    int getRateOfIntrest() {

        return 1;
    }
}

class Axis extends Bank {
    int getRateOfIntrest() {

        return 7;
    }
}

class Icici extends Bank {
    int getRateOfIntrest() {

        return 8;
    }
}

class Sbi extends Bank {
    int getRateOfIntrest() {

        return 9;
    }
}

class Canera extends Bank {
    int getRateOfIntrest() {

        return 7;
    }
}

class TestBank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Axis a = new Axis();
        Icici i = new Icici();
        Sbi s = new Sbi();

        System.out.println("intrest rate of bank is : " + a.getRateOfIntrest() + " %");
        System.out.println("intrest rate of bank is : " + i.getRateOfIntrest() + " %");
        System.out.println("intrest rate of bank is : " + s.getRateOfIntrest() + " %");


    }
}
