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
        double high = numberProvided;
        double mid = (high+low) / 2;

        while (Math.abs((mid * mid) - numberProvided) > eps) {
            if ((mid*mid) > numberProvided) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (high + low) / 2;
        }

        mid+= eps;
        //  Fixing the precision to 7 digits after the decimal.
        //  If 7-digit precision is to be changed, the respective tests should also be changed.
        long fixedPrecision = 10000000L;
        long newRoot = (long) (mid * fixedPrecision);
        mid = (double) newRoot / fixedPrecision;

        return mid;
    }
}
