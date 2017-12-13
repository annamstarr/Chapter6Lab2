public class ArrayTester {
    public static void main(String[] args) {
        int[][] arr1 = {{1,1,1},
                        {1,1,1}};
        int[][] arr2 = {{3,2,2},
                        {4,2,1}};
        ArrayCalculations ac = new ArrayCalculations();
        double avg = ac.averageArray(arr1);
        System.out.println("The average is " + avg);
        
        int[] result = ac.sumColumns(arr1);
        for (int thing: result) {
            System.out.print(thing + ", ");
        }
        
        int[][] squared = ac.squareArray(arr2);
        for (int[] row : squared) {
            for (int num : row) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
        
    }
}