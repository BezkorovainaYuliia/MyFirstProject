package Methoden;

public class MethodenUebungen {
    public static void main(String[] args) {
        String name = "Yuliia";
        String name2 = "Faru Bezkorovaina";
        greetStudent(name);
        greetStudent(name2);
        int ist = 20;
        System.out.println(isEven(ist));
        int a = 2;
        int b = 3;
        System.out.println(multiply(a, b));
    }

    public static void greetStudent(String name){
        System.out.println("Hallo " + name + ", ich bin einen Method");
    }

    public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int multiply(int number1, int number2){
        return number1 * number2;
    }
}
