public class ArrayTester {
    public static void ain(String[] args) {
        int[][] arr1 = {{1,1,1},
                        {1,1,1}
                    };
        ArrayCalculations ac = new ArrayCalculations();
        double avg = ac.averageArray(arr1);
        System.out.println("The average is " + avg);
        
        int[] result = ac.sumColumns(arr1);
        System.out.println(resul);
    }
}