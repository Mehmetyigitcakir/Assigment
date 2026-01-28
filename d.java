public class d {
    public static double average (int [] arrayInput){
        int size = arrayInput.length;
        int sum = 0;
        int average = 0;
        for (int i =0; i < size; i++ ){
        sum += arrayInput[i];
        }
        average = sum/ size; 
        return average;   
            
    }
    public static String difference (int average , int [] arrayInput){
        int[] newArr = new int[arrayInput.length];
            for (int i = 0; i < arrayInput.length; i++){
                newArr[i] = arrayInput[i] - average;
            }
        return newArr.toString();
    }
}
