package Bedingungen;

public class UebungenBedigung {
    public static void main(String[] args) {
        int age = 21;

        if (age >= 21) {
            System.out.println("Du bist vollaerig in den USA");
        }
        else if (age >= 18) {
            System.out.println("Du bist vollaerig in DE");
        }
        else {
            System.out.println("Du bist minderaerig");
        }
    }
}
