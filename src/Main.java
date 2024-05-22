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
        System.out.println("RANDOM NUMBER: " + rndInt(30,3));
        System.out.println();
        System.out.println("====== Uždavinys - 6 ======");
        System.out.println("Atsitiktinis skaitmuo: " + randomArray(3,40,8).length);
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
    public static int rndInt(int a, int b) {
       int rndNum = a + (int) Math.round(Math.random() * (b - a));
       System.out.println("Įvestų skaičių intervalas: [ " + a + " ir " + b + " ]");
       return rndNum;

    }
    // Uždavinys - 6
    public static int[] randomArray(int min, int max, int length) {
        int[] randomArray = new int[length];
        int i = 0;
        while (i < randomArray.length) {
            randomArray[i] = min + (int) Math.round(Math.random() * (max - min));
            i++;
        }
        System.out.println("MIN reikšmė = " + min);
        System.out.println("MAX reikšmė = " + max);
        return randomArray;
    }

}

