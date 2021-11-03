package de.chemnitztu.tuchemnitzprogrammingbasics.utils.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ExerciseOneTest {
    @Autowired
    ExerciseOne exerciseOne;

    @Test
    @DisplayName("Square Root Generator")
    public void testSquareRoot() {
        assertAll(
                () -> assertEquals(6.3245553, exerciseOne.squareRoot(40)),
                () -> assertEquals(6.4031242, exerciseOne.squareRoot(41)),
                () -> assertEquals(6.4807406, exerciseOne.squareRoot(42)),
                () -> assertEquals(6.5574385, exerciseOne.squareRoot(43)),
                () -> assertEquals(6.6332495, exerciseOne.squareRoot(44)),
                () -> assertEquals(6.7082039, exerciseOne.squareRoot(45)),
                () -> assertEquals(6.7823299, exerciseOne.squareRoot(46)),
                () -> assertEquals(6.8556546, exerciseOne.squareRoot(47)),
                () -> assertEquals(6.9282032, exerciseOne.squareRoot(48)),
                () -> assertEquals(7, exerciseOne.squareRoot(49)),
                () -> assertEquals(157, exerciseOne.squareRoot(24649)),
                () -> assertEquals(7.6, exerciseOne.squareRoot(57.76)),
                () -> assertEquals(3.6055512, exerciseOne.squareRoot(13)),
                () -> assertEquals(2.5396850, exerciseOne.squareRoot(6.45))
        );
    }
}




