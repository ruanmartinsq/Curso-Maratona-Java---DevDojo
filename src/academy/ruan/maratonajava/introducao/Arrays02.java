package academy.ruan.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = {5, 4, 3};

//        for (int i = 0; i <= numeros.length; i++) {
//            System.out.println(numeros2[i]);
//        }

        for(int num:numeros3) {
            System.out.println(num);
        }
    }
}
