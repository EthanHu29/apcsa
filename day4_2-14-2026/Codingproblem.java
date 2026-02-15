public class Codingproblem{
    public static int arraySum(int[] arr){
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += arr[i];
        }
        return result;
    }
    public static int[] rowSums(int[][] arr2D){
        int[] result = new int[arr2D.length];
        for(int i = 0; i<arr2D.length;i++){
            result[i] = arraySum(arr2D[i]);
        }
        return result;
    }
    public static boolean isDiverse(int[][] arr2D){
        boolean result = true;
        int[] rowresults = rowSums(arr2D);
        for(int i = 0; i<rowresults.length; i++){
            for(int j = i+1; j<rowresults.length; j++){
            
                    if(rowresults[i] == rowresults[j]){
                        result = false;
                    }
                
            }
        }
        return result;
    }
}