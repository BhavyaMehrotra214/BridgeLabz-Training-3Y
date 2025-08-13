import java.util.Scanner;

public class calculateavg{
      public static void main(String[] args){
           
          Scanner sc = new Scanner(System.in);
          System.out.print("first num:");
          double num1 = sc.nextInt();
       
          System.out.print("second num:");
          double num2 = sc.nextInt();

          System.out.print("third num:");
          double num3 = sc.nextInt();
          
          double avg = (num1 + num2 + num3) / 3;

          System.out.print("avg:" + avg);
          sc.close();
        }
 }

