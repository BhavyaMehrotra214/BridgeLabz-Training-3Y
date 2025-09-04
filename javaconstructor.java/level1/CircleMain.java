public class CircleMain {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        System.out.println();

        Circle customCircle = new Circle(5.5);
        System.out.println("Custom Circle:");
        customCircle.displayDetails();
    }
}