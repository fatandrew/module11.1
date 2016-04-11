import com.sun.javafx.geom.PickRay;
import org.junit.Test;

/**
 * Created by User on 08.03.2016.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        try {
            int base = 2;
            int height = -1;
            int radius = 2;

            int AreaOfRectangle = base * height;
            double a = 2;
            int AreaOfTriangle = ((base * height) / 2);
            double d = Math.pow(radius, a);
            double AreaOfCircle = (3.14 * d);
            boolean cNegative = AreaOfTriangle < 0;
            boolean vNegative = AreaOfRectangle < 0;
            boolean kNegative = AreaOfCircle < 0;
            if (AreaOfTriangle > 0) {
                System.out.println("Area of Triangle: " + AreaOfTriangle);
            }
            if (AreaOfRectangle > 0) {
                System.out.println("Area of Rectangle: " + AreaOfRectangle);
            }
            if (AreaOfCircle > 0) {
                System.out.println("Area of Circle: " + AreaOfCircle);
            }

            if (cNegative && vNegative) {
                throw new IllegalArgumentException("Areas of Triangle and Rectangle are negative");
            }
            if (cNegative) {
                throw new IllegalArgumentException("Area of Triangle is negative");
            }
            if (vNegative) {
                throw new IllegalArgumentException("Area of Rectange is negative");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
