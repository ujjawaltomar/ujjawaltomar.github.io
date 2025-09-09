public class MatrixAddition {
    public static void main(String[] args) {
        int[][]A = {{1,2},{3,4}};
        int[][]B = {{5,6},{7,8}};
        int[][]sum = new  int[2][2];

        for (int i=0;i<2;i++){
            for (int j = 0;j<2;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Matrix Addition:");
        for (int[]row:sum){
            for (int val:row){
                System.out.println(val+"");
            }
            System.out.println();
        }


    }
}
