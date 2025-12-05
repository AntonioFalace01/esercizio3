package it.unical.demacs;

public class App {

    public static void main(String[] args) {
        Algorithms alg = new Algorithms();
        String string = "amore";
        String string2 = "arome";
        System.out.println("Are anagrams: " + alg.areAnagrams(string, string2));

        int[] array = new int[]{7, 1, 8, 3, 2, 10, 11};
        alg.sort(array);
        System.out.println("Sorted array: ");
        printArray(array);

    }

    private static void printArray(int[] array) {
        int n = array.length;
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
