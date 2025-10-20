package academy.ruan.maratonajava.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] testeArray = new int[3][];

        testeArray[0] = new int[2];
        testeArray[1] = new int[]{1,2,3,4,5};
        testeArray[2] = new int[6];

        int[][] testeArray2 = {{0,0},{1, 2, 3}, {1, 2, 3, 1, 2, 3}};

        for (int[] arrayBase : testeArray) {
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
