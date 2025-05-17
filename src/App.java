import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] matriz = new int[3][3];

        //primeira linha
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        //segunda linha
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        //terceira linha
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        
        
        System.out.println("imprimindo a primeira linha");
        
        for(int i = 0; i < 3; i++){
            System.out.print(" "+mat[0][i]);
        }
        System.out.println();

        System.out.println("Imprimindo a matriz inteira");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }


        //Matriz aleatoria
        Random random = new Random();

        int[][] matrizCincoPorCinco = new int [5][5];

        for(int i = 0; i < matrizCincoPorCinco.length; i++){
            for (int j = 0; j < matrizCincoPorCinco[i].length; j++) {
                matrizCincoPorCinco[i][j] = (int) random.nextInt(20*2);
            }
        }

        System.out.println("Imprimindo matriz aleatoria");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+matrizCincoPorCinco[i][j]);
            }
            System.out.println();
        }

        User usuario1 = new User("john", 1);
        
        
        
    }
}
