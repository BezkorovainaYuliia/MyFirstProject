package Arrays;

public class ArrayExersice {
    public static void main(String[] args) {
        /*
         * Programmieren: Array
         * Erstelle ein Array vom Typ String mit einer Länge von 4.
         *
         * Speichere an Index 0 den Wert "Florian".
         * Speichere an Index 1 den Wert "Martin".
         * Speichere an Index 2 den Wert "Dominic".
         * Speichere an Index 3 den Wert "Sara".
         */

        String[] arrayNamen = new String[4];
        arrayNamen[0] = "Florian";
        arrayNamen[1] = "Martin";
        arrayNamen[2] = "Dominic";
        arrayNamen[3] = "Sara";
        for (String name : arrayNamen) {
            System.out.println(name);
        }
        /*
         * Programmieren: Arrays
         * Erstelle ein neues Java-Projekt und implementiere die folgenden Schritte. Verwende Schleifen, wenn nötig:
         *
         * Schritt 1: Erstelle ein Array mit den Zahlen von 1 bis 10 und gib es auf der Konsole aus.
         * Schritt 2: Berechne die Summe aller Zahlen im Array und gib das Ergebnis auf der Konsole aus.
         * Schritt 3: Finde die größte Zahl im Array und gib sie auf der Konsole aus.
         * Schritt 4: Erstelle ein zweites Array mit den Zahlen von 11 bis 20.
         * Schritt 5: Führe eine elementweise Addition der beiden Arrays durch und speichere das Ergebnis in
         *             einem dritten Array. Gib das Ergebnisarray auf der Konsole aus.
         */
        //Schritt 1
        int[] arrayInt0_10 = new int[10];
        for (int i = 0; i < arrayInt0_10.length; i++) {
            arrayInt0_10[i] = i+1;
        }
        print("Zahlen von 1 bis 10",arrayInt0_10);

        //Schritt 2
        int summa = 0;
        for (int element : arrayInt0_10) {
            //Summa von Arrays
            summa += element;
        }
        System.out.println("Die Summe aller Zahlen im Array ist " + summa);

        //Schritt 3
        int max = arrayInt0_10[0];
         for (int i = 1; i < arrayInt0_10.length; i++) {
             if (max < arrayInt0_10[i])
                 max = arrayInt0_10[i];
         }
        System.out.println("Die groesste Zahl im Array ist " + max);

         //Schritt 4
        int[] arrayInt11_20 = new int[10];
        for (int i = 0; i < arrayInt11_20.length; i++) {
            arrayInt11_20[i] = i+11;
        }
        print("Zahlen von 11 bis 20",arrayInt11_20);

        //Schritt 5
        int[]  arrayIntSammlung = new int[20];
        for (int i = 0; i < arrayIntSammlung.length; i++) {
            if (i < 10) {
                arrayIntSammlung[i] = arrayInt0_10[i];
            }
            if (i >= 10) {
                arrayIntSammlung[i] = arrayInt11_20[i-10];
            }
        }
        print("Sammlung von Arrays", arrayIntSammlung);

    }
    public static void print(String message, int[] array) {
        System.out.println(message);
        for(int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}
