import java.util.Scanner;

public class kilotomiles{
     public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("enter kilo:");
      double kilo = sc.nextDouble();

      double miles = kilo * 0.6213;
 
      System.out.println(miles);
      sc.close();
   }
}

