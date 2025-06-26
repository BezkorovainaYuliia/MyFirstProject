package Arrays;

public class UebungenArrays {
    public static void main(String[] args) {
        String [] gruppe2 = {"Niko Morez", "Yuliia Bezkorovaina", "Syuley Manahmedov", "Felix Canditt"};
        System.out.println(gruppe2[0] + " " + gruppe2[1] + " " + gruppe2[2] + " " + gruppe2[3]);

        gruppe2 = new String[4];
        gruppe2[0] = "1. Niko Morez";
        gruppe2[1] = "2. Yuliia Bezkorovaina";
        gruppe2[2] = "3. Syuley Manahmedov";
        gruppe2[3] = "4. Felix Canditt";

        System.out.println(gruppe2[0] + "\n" + gruppe2[1] + "\n" + gruppe2[2] + "\n" + gruppe2[3]);

    }
}
