import java.util.Random;
import java.util.Scanner;

public class a {

 public static int[] CreateArray(){
  int size;

  Scanner scan = new Scanner(System.in);
  System.out.print("Please Enter an array size: ");
  size = scan.nextInt();

  Random rndm = new Random();   
   int[] newArr = new int[size];

  for (int i = 0; i < size; i++ ){
     newArr[i] = rndm.nextInt(100);

   }

 scan.close();
 return newArr;

 }
    
}