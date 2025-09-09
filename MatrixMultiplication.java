public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][]A={{1,2},{3,4}};
        int[][]B={{2,0},{1,2}};
        int[][]product = new int[2][2];
        for (int i=0;i<2;i++){
            for (int j = 0;j<2;j++){
                product[i][j]=0;
                for (int K = 0;K<2;K++){
                    product[i][j]+= A[i][K]*B[K][j];
                     

                }
            }
        }
        System.out.println("Matrix multiplication");
        for (int[]row:product){
            for (int val:row){
                System.out.println(val+"");
            }
            System.out.println();
        }
    }
}
