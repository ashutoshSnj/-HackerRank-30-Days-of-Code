import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); 
        int tipPercent = scan.nextInt(); 
        int taxPercent = scan.nextInt();
        scan.close();
      
         
        int totalCost = (int) Math.round(mealCost + (mealCost * tipPercent * 0.01) + (mealCost * taxPercent * 0.01));
      
        
        System.out.println( totalCost );
    }
}