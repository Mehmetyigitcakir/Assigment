import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        int[] array = null;
        int avg = 0;

        
        
        while (option != 8 ){
             System.out.println("-------MENU------");
            System.out.println("1. Create Array");
            System.out.println("2. Max Finder");
            System.out.println("3. Min Finder");
            System.out.println("4. Find oddSum");
            System.out.println("5. Find evenSum");
            System.out.println("6. Average");
            System.out.println("7. Difference");
            System.out.println("8. Exit");
            System.out.println("----------------------");
            System.out.println("Enter your options: ");
            

            if (scanner.hasNextInt()){
                option = scanner.nextInt();
            } 
            else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue; // Skip to the next iteration
            }
           
            if (option == 1){
                array = a.CreateArray();
                System.out.println("Array created successfully.");
            }
            else if (option == 2){
                if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    System.out.println("Max finder result: " + c.Maxfinder(array));
                    System.out.println("max found successfully.");
                }
            }
            else if (option == 3){
                if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    System.out.println("Min finder result: " + c.Minfinder(array));
                    System.out.println("min found successfully.");
                }
            }
            else if (option == 4){
                 if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    System.out.println("odd sum result: " + e.findOddSum(array));
                    System.out.println("odd sum found successfully.");
                }
            }
            else if (option == 5){
                 if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    System.out.println("even sum result: " + e.findEvenSum(array));
                    System.out.println("even sum found successfully.");
                }
            }
            else if (option == 6){
                 if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    System.out.println("average result: " + d.average(array));
                    System.out.println("average found successfully.");
                }
            }
            else if (option == 7){
                 if (array == null) {
                    System.out.println("You should create an array first.(Option 1)");

                } else {
                    avg = d.average(array);
                    System.out.println("difference result: " + d.difference(avg, array));
                    System.out.println("difference found successfully.");
                }
            }
            else if (option == 8){
                System.out.println("Exiting the program, see you again!");
            }
        }
        scanner.close();
    }
}
