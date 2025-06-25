package Methoden;

import java.util.Locale;

public class MethodenExercise {
    public static void main(String[] args) {
        /**
         * Programmieren: Begrüßungsmethode
         * Schreibe eine Java-Methode, die einen String als Parameter erhält und eine Begrüßung in der Konsole ausgibt.
         *
         * Schritt 1: Definiere die Methodensignatur.
         * Schritt 2: Gib die Begrüßung in der Konsole aus.
         */
        String name = "Yuliia";
        begruessung(name);

        /**
         * Programmieren: Einfache Berechnung
         * Schreibe eine Java-Methode, die zwei Zahlen als Parameter erhält und das Ergebnis ihrer Addition zurückgibt.
         *
         * Schritt 1: Schreibe eine Methode mit dem Namen add, die zwei int-Parameter entgegennimmt und
         *            die Summe der beiden Zahlen zurückgibt.
         * Schritt 2: Rufe die Methode innerhalb deiner main()-Methode auf und gib das Ergebnis in der Konsole aus.
         */
        int nummer1 = 5;
        int nummer2 = 5;
        System.out.println("Summa " + nummer1 + " + " + nummer2 + " ist " + add(nummer1, nummer2));

        /*
         * Programmieren: Zusätzliche Funktionen
         * Überprüfe und verstehe dein Programm. Erweitere es anschließend.
         *
         * Schritt 1: Kopiere die add-Methode, um auch Gleitkommazahlen (double) zu unterstützen.
         * Schritt 2: Schreibe eine weitere Methode mit dem Namen subtract, die zwei int-Parameter entgegennimmt
         *              und die Differenz der beiden Zahlen zurückgibt.
         * Schritt 3: Schreibe eine Methode mit dem Namen makePositive, die eine negative Zahl in eine positive Zahl
         *              umwandelt, aber positive Zahlen unverändert zurückgibt. (Beispiel: Eingabe 5 → Rückgabe 5,
         *              Eingabe -28 → Rückgabe 28)
         * Falls du diese Aufgabe bereits erledigt hast, kannst du mit der Bonusaufgabe auf der nächsten Seite fortfahren.
         */
        double dNummer1 = -1.2;
        double dNummer2 = 2.2;
        System.out.println("Summa " + dNummer1 + " + " + dNummer2 + " ist " + add(dNummer1, dNummer2));
        System.out.println("Sub " + nummer1 + " - " + nummer2 + " ist " + subtract(nummer1, nummer2));

        int istPositiv = 2;
        System.out.println("dei Zahl " +  istPositiv + " kann positiv " + makePositive(istPositiv) + " sein");

        /*
          Bonus
          Super, du hast gute Fortschritte gemacht! Jetzt arbeite an den Bonusaufgaben.
          #1
          Erstelle eine Bedingung, die die Methode subtract aufruft, wenn die erste Zahl größer als die zweite ist,
          andernfalls soll die Methode add aufgerufen werden.
         */
        nummer1 = 6;
        nummer2 = 5;
        System.out.println("Nummer 1 ist "+ nummer1 + "\n"
                + "Nummer 2 ist "+ nummer2 + "\n"
                + "Deshalb ist "
                + operation(nummer1, nummer2));

         /* #2
         * Schreibe eine Methode, die überprüft, ob eine Zahl gerade ist. Gerade Zahlen sollen unverändert zurückgegeben
         * werden, während ungerade Zahlen verdoppelt werden.
         */
         int zahl = 3;
         System.out.println(fallsGeradeIst(zahl));

         /* Schreibe eine Methode, die einen String als Parameter entgegennimmt und überprüft, ob es sich um
         * ein Palindrom handelt (d. h. das Wort liest sich vorwärts und rückwärts gleich).
         * Gibt true zurück, wenn es ein Palindrom ist, andernfalls false.
         */
        String str = "tAsSa";
        System.out.println("Das Wort " + str + " ist Polindrom " + istPolindrom(str));

    }
    //Programmieren: Begrüßungsmethode
    public static void begruessung(String name){

        System.out.println("Hallo " + name + ", ich bin einen Method");
    }

    //Programmieren: Einfache Berechnung
    public static int add(int nummer1, int nummer2){

        return nummer1 + nummer2;
    }

    //Programmieren: Zusätzliche Funktionen
    //Schritt #1
    public static double add(double nummer1, double nummer2){
        return nummer1 + nummer2;
    }
    //Schritt #2
    public static int subtract(int nummer1, int nummer2){

        return nummer1 - nummer2;
    }
    //Schritt #3
    public static int makePositive(int nummer){
        if (nummer < 0) {
            nummer *= -1;
        }
        return nummer;
    }

    //Bonus #1
    public static int operation(int nummer1, int nummer2){
        if (nummer1 > nummer2){
            return subtract(nummer1, nummer2);
        }
        return add(nummer1, nummer2);
    }
    //Bonus #2
    public static int fallsGeradeIst(int zahl){
        if (zahl % 2 != 0 ){
            return zahl * 2;
        }
        return zahl;
    }
    //Bonus #3
    public static boolean istPolindrom(String str){
        StringBuilder strBuilder = new StringBuilder(str.toLowerCase());
        strBuilder.reverse();
        return strBuilder.toString().equals(str.toLowerCase());
    }

}
