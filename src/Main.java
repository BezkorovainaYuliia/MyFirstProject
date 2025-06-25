public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Java ist so cool!");
        System.out.println("Ich lerne Java!");
        //Ganzzahlen
        byte zbyte = 127;
        short zshort = 32767;
        int zint = 32767;
        long zlong = 9223372036854775807L;
        System.out.println(zlong);
        System.out.println(zshort);

        //Fliesskommanzahlen
        float f = 3.1415926535F; // Kürzt Nachkommastellen ab
        System.out.println(f); // Ausgabe: 3.1415927

        double d = 3.1415926535;
        System.out.println(d); // Ausgabe: 3.1415926535

        //Wahrheitswerte (Boolean)
        boolean isArbeit = false;

        //Zeichen
        char c = 'v';
        System.out.println(c);
        String str = "Hello Kumpel";
        System.out.println(str);

        if (isArbeit)
        {
            System.out.println("Ich bin bei der Arbeit");
        } else {
            System.out.println("ich mache den Urlaub");
        }

        //Mathematische Operatoren

        int a1 = 5;
        int a2 = 3;
        int sum = a1 + a2;
        int diff = a1 - a2;
        int prod = a1 * a2;
        int quotient = a1 / a2;
        System.out.println(quotient);

        double divisor = (double) a1 / a2;
        System.out.println(divisor);

        String hello = "hello\t";
        String world = "world";
        System.out.println(hello + world);

        //Vergleichsoperatoren
        boolean isEqual = a1 == a2;
        boolean isNichtEqual = a1 != a2;
        boolean isGrosser = a1 > a2;
        boolean isKleiner = a1 < a2;
        boolean isStringGleich = hello.equals(world);
        System.out.println(isStringGleich);
    }
}
