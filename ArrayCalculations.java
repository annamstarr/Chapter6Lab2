public class ArrayCalculations
{
        
    public ArrayCalculations()
    {
        
    }

    public double averageArray(int[][] nums) {
        int sum = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col< nums[0].length; col++) {
                sum+= nums[row][col]; // i want to that row and col and add that value
            }
        }
        int total = nums.length * nums[0].length; // of elements to know what to divide by
        return (double) sum/total;
    }
    public int[] sumColumns(int[][] nums) {
        int[] result = new int[nums[0].length];
        for (int col = 0; col < nums[0].length; col++) {
            int total = 0;
            for(int row = 0; row <nums.length; row++) {
                total += nums[row][col];
            }
            result[col] = total;
        }
        return result;
    }
    
}
