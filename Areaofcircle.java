import java.util.Scanner;
public class Areaofcircle{
     public static  void main(String[] args){
            Scanner sc = new Scanner(System.in);
             System.out.print("enter a radius:");
             double radius = sc.nextDouble();
             double area =  Math.PI *radius*radius;
             System.out.println("area:" +area);

             sc.close();
      }
}
