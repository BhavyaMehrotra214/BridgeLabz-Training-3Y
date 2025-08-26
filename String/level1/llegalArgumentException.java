import java.util.Scanner;
public class llegalArgumentException{
    public static void argumentexception(String text){
        System.out.println(text.substring(5,2));
    }
    public static void handleException(String text){
        try{
            System.out.println(text.substring(5,2));
        }catch(llegalArgumentException e){
            System.out.println("Caught llegalArgumentException :" + e);
        }catch(RuntimeException e){
            System.out.println("Caught RuntimeException:" + e);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}
