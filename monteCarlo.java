import java.lang.Math; 
public class monteCarlo{
   public static void main(String args[]){
      double x, y, total; 
      int inCircle = 0;

      for(int i = 1; i < 10001; i++){
         x = Math.random(); System.out.println("Rand x: " + x);
         y = Math.random(); System.out.println("Rand y: " + y);
         x = x * 1 - 1; System.out.println("New x: " + x);
         y = y * 1 - 1; System.out.println("New y: " + y);
         x = Math.pow(x, 2); System.out.println("Pow x: " + x);
         y = Math.pow(y, 2); System.out.println("Pow y: " + y);
         
         System.out.println();
         if(Math.sqrt(x+y) < 1){ inCircle++; }

         total = i;

         if(i % 100 == 0){
            System.out.println("Points within the circle: " + inCircle);
            System.out.println("Total points: " + i);
            System.out.println("Current estimated area: " + (inCircle/total) * 4);
            System.out.println();
         }
      }
   }
}
