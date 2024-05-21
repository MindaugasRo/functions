public class Main {
    public static void main(String[] args) {
        System.out.println("====== Uždavinys - 1 ======");
        System.out.println(" = " + numberAddition(3,4));
        System.out.println();
        System.out.println("====== Uždavinys - 2 ======");
        System.out.println("Rezultatas: " + PISq());
        System.out.println();
        System.out.println("====== Uždavinys - 3 ======");
        System.out.println(" = " + multiplication(42,34));
        System.out.println();
        System.out.println("====== Uždavinys - 4 ======");
        System.out.println("Įvestas skaičius: " + numberCycle(33));
        System.out.println();
        System.out.println("====== Uždavinys - 5 ======");
        System.out.println("RANDOM NUMBER: " + twoNumberCycle(3,60));
        System.out.println();


    }
    // Uždavinys - 1
    public static int numberAddition(int a, int b) {
        System.out.print( a + " + " + b );
        return a + b;
    }
    // Uždavinys - 2
    public static double PISq() {
        return 9.8596;
    }

    // Uždavinys - 3
    public static int multiplication (int a, int b) {
        System.out.print( a + " * " + b );
        return a * b;
    }
    // Uždavinys - 4
    public static int numberCycle(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print( (i + 1) + " " );
        }
        System.out.println();
        return a;
    }
    // Uždavinys - 5
    // Įvedus du kintamuosius MIN ir MAX sugeneruoti Random skaičių ir jį gražinti
    public static int twoNumberCycle(int min, int max) {
       int minMAX = min + (int) Math.round(Math.random() * (max - min));
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
       return minMAX;
    }

}

