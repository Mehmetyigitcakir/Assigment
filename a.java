import java.util.Random;

public class a {

 public static int[] CreateArray(int size){
  Random rndm = new Random();   
   int[] newArr = new int[size];

  for (int i = 0; i < size; i++ ){
     newArr[i] = rndm.nextInt(100);
  }
 return newArr;


 }

    
}