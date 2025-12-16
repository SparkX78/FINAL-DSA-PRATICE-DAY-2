public class Binary_Matrix {
    public static int[][] BinaryMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    result[i][j] = 0;
                }
                else{
                    if(i > 0){
                        result[i][j] = Math.min(result[i][j], result[i-1][j]+1);
                    }
                    if(j > 0){
                        result[i][j] = Math.min(result[i][j], result[i][j-1]+1);
                    }
                }
            }
        }

        for(int i = rows-1; i >= 0; i--){
            for(int j = cols-1; j >= 0; j--){
                if(matrix[i][j] != 0){
                    if(i < rows-1){
                        result[i][j] = Math.min(result[i][j], result[i+1][j]+1);
                    }
                    if(j < cols-1){
                        result[i][j] = Math.min(result[i][j], result[i][j+1]+1);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[][] matrix = {
                            {0,1,1},
                            {1,1,1},
                            {1,1,0}
                                    };

        int[][] result = BinaryMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }

    }
}
