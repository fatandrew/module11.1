import org.junit.Test;

import java.util.Scanner;

/**
 * Created by User on 10.03.2016.
 */
public class Degrees {
    public static void main(String[] args) {

        try {
            int C = 100;

            int F = -100;
            double FromCToF = (C * 1.8 + 32);
            double FromFToC = ((F - 32) / 1.8);
            boolean cToFNegative = FromCToF < 0;
            boolean fToCNegative = FromFToC < 0;
            final Degrees degreesTest = new Degrees();
if (FromCToF > 0) {
    System.out.println(FromCToF);
}
            if (FromFToC >0) {
                System.out.println(FromFToC);
            }
            if(cToFNegative && fToCNegative){
                throw new IllegalArgumentException("FromCtoF and FromFToC is negative");
            }
            if (FromCToF < 0) {
                throw new IllegalArgumentException("FromCtoF is negative");
               }
            if (FromFToC < 0) {
                throw new IllegalArgumentException("FromFToC is negative");
            }
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }

}