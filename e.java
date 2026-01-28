public class e {
// hello
    public static int findOddSum(int arr[]){
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 1){
                oddSum += arr[i];
            }
        }
    }
    public static int findEvenSum(int arr[]){
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                evenSum += arr[i];
            }
        }
    }
}
