public class d {
    public static int average (int [] arrayInput){
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
        String result = "";
        for (int i = 0; i < arrayInput.length; i++){
            newArr[i] = arrayInput[i] - average;
        }
        result += "[";
        for (int i = 0; i < newArr.length; i++){
            result += newArr[i];
            if (i < newArr.length -1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
