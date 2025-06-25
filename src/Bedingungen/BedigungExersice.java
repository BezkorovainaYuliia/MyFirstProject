package Bedingungen;

public class BedigungExersice {
    public static void main(String[] args) {
        /**
         * Programmieren: Altersprüfung
         * Schritt 1: Erstelle eine Variable age.
         * Schritt 2: Programmiere eine if-Bedingung,
         *            um zu prüfen, ob das Alter größer als 18 ist.
         * Schritt 3: Gib das entsprechende Ergebnis aus.
          */

        int age = 25;
        if (age >= 18) {
            System.out.println("Du bist genauso richtigen Alt");
        }
        else {
            System.out.println("Du bist kleiner");
        }

        /**
         * Programmieren: Namenslänge
         * Schritt 1: Erstelle eine Variable name.
         * Schritt 2: Überprüfe, ob der Name länger als 10 Zeichen ist.
         * Schritt 3: Gib das entsprechende Ergebnis aus.
         */
        String name = "Bezkorovaina";

        if (name.length() > 10) {
            System.out.println(name + "! Dein Name ist zu lang und hat " +
                    name.length() + " Buchstaben");
        }
        else {
            System.out.println(name + "! Dein Name ist richtig klein");
        }
        /**
         * Bonus
         * Super, du hast gute Fortschritte gemacht! Jetzt arbeite an den Bonusaufgaben.
         **/
         /** Überprüfe, ob eine int-Variable gerade oder ungerade ist, und gib das Ergebnis aus.**/
         int zahl = 2;

         if  (zahl % 2 == 0) {
             System.out.println("int-Variable " + zahl + " ist gerade");
         }
         else {
             System.out.println("int-Variable " + zahl + " ist ungerade");
         }


        /** Erstelle eine int-Variable grade mit einem Wert zwischen 0-100. Überprüfe:
         * 90-100: Gib "Note A" aus.
         * 70-90: Gib "Note B" aus.
         * 50-70: Gib "Note C" aus.
         * 20-50: Gib "Note D" aus.
         * 0-20: Gib "Note F" aus.**/
        int grade = -101;

        if ((grade >= 0) && (grade <=20)){
            System.out.println("Note F");
        }
        else if ((grade >= 21) && (grade <=50)) {
            System.out.println("Note D");
        }
        else if ((grade >= 51) && (grade <=70)) {
            System.out.println("Note C");
        }
        else if ((grade >= 71) && (grade <=90)) {
            System.out.println("Note B");
        }
        else if ((grade >= 91) && (grade <=100)){
            System.out.println("Note A");
        }
        else {
            System.out.println("Note ist False");
        }


        /** Erstelle eine int-Variable und überprüfe, ob der Wert positiv oder negativ ist.
         * Gib das Ergebnis als "x ist eine positive Zahl" oder "x ist eine negative Zahl" aus.
        */
        int x = -4;

        if (x >= 0){
            System.out.println("x ist eine positive Zahl");
        }
        else {
            System.out.println("x ist eine negative Zahl");
        }
    }
}
