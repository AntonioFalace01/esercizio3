package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgorithmsTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setUp() {
        algorithms = new Algorithms();
    }

    @Test
    public void inputNullArray(){
        assertThrows( IllegalArgumentException.class, () -> {)
            algorithms.sort(null);
        });
    }


}
