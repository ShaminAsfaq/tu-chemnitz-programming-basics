package de.chemnitztu.tuchemnitzprogrammingbasics.utils.exercises;

import org.springframework.stereotype.Service;

@Service
public class ExerciseOne {
    public ExerciseOne() {
    }

    /**
     * biSection Method (or, Binary Search)
     * @param numberProvided is a double
     * @return The Square Root of the number provided
     */
    public double squareRoot(double numberProvided) {
        double eps = 0.000000000001;
        double low = 0;
        double mid = 0;
        double high = numberProvided / 2;

        while (high-low > eps) {
            mid = (high + low) / 2;
            if ((mid*mid) > numberProvided) {
                high = mid;
            } else {
                low = mid;
            }
        }

        //  Fixing the precision to 7 digits after the decimal
        long fixedPrecision = 10000000L;
        long newRoot = (long) (mid * fixedPrecision);
        mid = (double) newRoot / fixedPrecision;

        return mid;
    }
}
