import java.lang.Math;

public class Volume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius in kilometers
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f km³\n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.2f mi³\n", volumeMiles3);
    }
}
