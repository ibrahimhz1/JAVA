package basics101;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagArr = new int[3][];
        jagArr[0] = new int[4];
        jagArr[1] = new int[3];
        jagArr[2] = new int[2];

        // randomly assigning some values in the array
        for(int i=0; i<jagArr.length; i++){
            for(int j=0; j<jagArr[i].length; j++){
               jagArr[i][j] = (int) (Math.random() * 10);
            }
        }

        // printing values from the arrays
        for(int i=0; i<jagArr.length; i++){
            for(int j=0; j<jagArr[i].length; j++){
                System.out.print(jagArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
