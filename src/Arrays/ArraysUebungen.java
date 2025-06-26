package Arrays;

public class ArraysUebungen {
    public static void main(String[] args) {
        String [] gruppe2 = {"Niko Morez", "Yuliia Bezkorovaina", "Syuley Manahmedov", "Felix Canditt"};
        System.out.println(gruppe2[0] + " " + gruppe2[1] + " " + gruppe2[2] + " " + gruppe2[3]);

        gruppe2 = new String[4];
        gruppe2[0] = "Niko Morez";
        gruppe2[1] = "Yuliia Bezkorovaina";
        gruppe2[2] = "Syuley Manahmedov";
        gruppe2[3] = "Felix Canditt";

        System.out.println("Die Liste von Gruppe #2");
        for (int i = 0; i < gruppe2.length; i++) {
            System.out.println(gruppe2[i]);
        }

        System.out.println("Die Liste von Gruppe #2");
        for (int i = gruppe2.length - 1; i > -1; i--) {
            System.out.println(gruppe2[i]);
        }

        System.out.println("Die Liste von Gruppe #2 (Foreach)");
        for (String name : gruppe2) {
            System.out.println(name);
        }

        System.out.println("Die Liste von Gruppe #2");
        for (int i = gruppe2.length - 1; gruppe2[i].startsWith("Yuliia") || i > 1; i--) {
            System.out.println(gruppe2[i]);
        }

    }
}
