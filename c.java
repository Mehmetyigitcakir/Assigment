public class c {
    public static int maxvalue=Integer.MIN_VALUE;
    public static int minvalue=Integer.MAX_VALUE;
    public static int Maxfinder(int[] array){
    for(int i=0;i<array.length;i++){
        if(array[i]>maxvalue){
            maxvalue=array[i];
        }
    }
    return maxvalue;
    }
    public static int Minfinder(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]<maxvalue){
                minvalue=array[i];
            }
        }
        return minvalue;
    }
}
