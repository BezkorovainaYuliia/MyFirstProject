package Operatoren;

public class OperatorenExercise {

    public static void main(String[] args) {
        /**
         * Programmieren: Operatoren
         * Führe arithmetische Operationen durch und verwende Variablen in Java.
         */

        /** Schritt 1: Deklariere zwei Variablen a und b vom Typ int und weise ihnen beliebige Ganzzahlen zu.
         */
        int a = 10;
        int b = 20;
        /** Schritt 2: Addiere die Werte von a und b und speichere das Ergebnis in einer neuen Variable sum.
         */
        int sum = a + b;
         /** Schritt 3: Gib den Wert von sum in der Konsole aus, zusammen mit dem Text "Summe: ".
         */
        System.out.println("Summe: " + sum);

        /**
         * Programmieren: Relationale Operatoren
         * Führe arithmetische Operationen mit verschiedenen Datentypen durch und verwende relationale Operatoren.
         */
         /* Schritt 1: Führe arithmetische Operationen mit zwei int-Werten durch
         (Addition, Subtraktion, Multiplikation, Division) und gib die Ergebnisse in der Konsole aus.
          */
        int add =  a + b;
        System.out.println("Summe: " + add);
        int diff = a - b;
        System.out.println("Differents: " +  diff);
        int multiply = a * b;
        System.out.println("Multiply: " + multiply);
        int divide = a / b;
        System.out.println("Divide: " + divide);

         /* Schritt 2: Vergleiche zwei int-Werte hinsichtlich: größer als, kleiner als, Gleichheit und
         gib die Ergebnisse in der Konsole aus.
          */
        boolean istGrosser = a > b;
        System.out.println("istGrosser: " + istGrosser );
        boolean istKleiner = a < b;
        System.out.println("istKleiner: " + istKleiner );
        boolean istGleich = a == b;
        System.out.println("istGleich: " + istGleich );

         /* Schritt 3: Wiederhole die Schritte 1 und 2, aber verwende dieses Mal float- und double-Werte.
         */
        float f1 = 1.222222f;
        float f2 = 3.3333333f;
        istGrosser = f1 > f2;
        System.out.println("istGrosser: " + istGrosser);
        istKleiner = f1 < f2;
        System.out.println("istKleiner: " + istKleiner);
        istGleich  =    f1 == f2;
        System.out.println("istGleich: " + istGleich);

        double d1 = 1.222222f;
        double d2 = 3.3333333f;
        istGrosser = d1 > d2;
        System.out.println("istGrosser: " + istGrosser);
        istKleiner = d1 < d2;
        System.out.println("istKleiner: " + istKleiner);
        istGleich  =    d1 == d2;
        System.out.println("istGleich: " + istGleich);

        /**
         * Bonus: Strings vergleichen
         * Führe Vergleiche zwischen Strings durch.
         */
         /** Schritt 1: Erstelle zwei String-Variablen mit den Werten "Hello" und "World" und vergleiche sie mit >, < und ==.
         */
        String str1 = "Hello";
        String str2 = "World";
        istGleich = str1 == str2;
        System.out.println("istGleich: " + istGleich);
        //istKleiner = str1 > str2;
        // istGrosser = str1 < str2;

        /** Schritt 2: Erstelle zwei String-Variablen mit den Werten "A" und "B" und vergleiche sie mit >, < und ==.
         *
         */
        char c1 = 'A';
        char c2 = 'B';
        istGleich = c1 == c2;
        System.out.println("istGleich: " + istGleich);
        istKleiner = c1 > c2;
        System.out.println("istKleiner: " + istKleiner);
        istGrosser = c1 < c2;
        System.out.println("istGrosser: " + istGrosser);
        /** Schritt 3: Erstelle zwei String-Variablen mit den Werten "a" und "B" und vergleiche sie mit >, < und ==.
         */
        str1 = "A";
        str2 = "B";
        istGleich = c1 == c2;
        System.out.println("istGleich: " + istGleich);
        istKleiner = c1 > c2;
        System.out.println("istKleiner: " + istKleiner);
        istGrosser = c1 < c2;
        System.out.println("istGrosser: " + istGrosser);
    }
}
