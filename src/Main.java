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
        int[] arr = {5,7,8};
        numberCycle(arr);
        System.out.println();

        System.out.println("====== Uždavinys - 5 ======");
        int ra = 4;
        int rb = 26;
        int randomNumber = rndInt( ra,rb ) ;
        System.out.println("Atsitiktinis skaicius " + randomNumber + " tarp " + ra + " ir " + rb);
        System.out.println();

        System.out.println("====== Uždavinys - 6 ======");
        int[] rndArr = randomArray(3,40,3);
        System.out.println("Masyvo ilgis: " + rndArr.length);
        numberCycle(rndArr);
        System.out.println();

        System.out.println("====== Uždavinys - 7 ======");
        System.out.println(sumArray(rndArr));


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
    public static void numberCycle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );
        }
        System.out.println();
    }
    // Uždavinys - 5
    public static int rndInt(int ra, int rb) {
        return ra + (int) Math.round(Math.random() * (rb - ra));
    }
    // Uždavinys - 6
    public static int[] randomArray(int min, int max, int length) {
        int[] randomArray = new int[length];
        int i = 0;
        while (i < randomArray.length) {
            randomArray[i] = min + (int) Math.round(Math.random() * (max - min));
            i++;
        }
        return randomArray;
    }
    // Uždavinys - 7
    public static int sumArray (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum ;
    }
    // Uždavinys - 8


}

