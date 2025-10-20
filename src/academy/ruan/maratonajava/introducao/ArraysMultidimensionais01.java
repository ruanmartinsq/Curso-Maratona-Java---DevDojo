package academy.ruan.maratonajava.introducao;

public class ArraysMultidimensionais01 {
    public static void main (String[] args) {
        int [][]dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        System.out.println("O mês de Janeiro tem " + dias[0][0] + " dias");

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------------");

        for(int[] arrayInteiros : dias) {
            for (int num : arrayInteiros) {
                System.out.println(num);
            }
        }
    }
}
