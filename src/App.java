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

        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        System.out.println(mat[0][0]+" "+mat[0][1]+" "+mat[0][2]);
    }
}
