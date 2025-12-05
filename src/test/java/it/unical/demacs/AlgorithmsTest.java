package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setUp() {
        algorithms = new Algorithms();
    }

    @Test
    public void inputNullArray(){
        assertThrows(IllegalArgumentException.class, () -> algorithms.sort(null));
    }

    @Test
    public void sortHappyPathAndEdgeCases(){
        int[] data = {7,1,8,3,2,10,11};
        algorithms.sort(data);
        assertArrayEquals(new int[]{1,2,3,7,8,10,11}, data);

        int[] empty = {};
        algorithms.sort(empty);
        assertArrayEquals(new int[]{}, empty);

        int[] single = {5};
        algorithms.sort(single);
        assertArrayEquals(new int[]{5}, single);

        int[] duplicates = {2,3,2,1};
        algorithms.sort(duplicates);
        assertArrayEquals(new int[]{1,2,2,3}, duplicates);

        int[] reverse = {3,2,1};
        algorithms.sort(reverse);
        assertArrayEquals(new int[]{1,2,3}, reverse);
    }

    @Test
    public void areAnagramsHappyPathAndEdgeCases(){
        assertTrue(algorithms.areAnagrams("roma","amor")); // case-insensitive
        assertTrue(algorithms.areAnagrams("aab","aba"));
        assertFalse(algorithms.areAnagrams("abc","ab"));
        assertFalse(algorithms.areAnagrams("abc","abd"));
    }

    @Test
    public void areAnagramsNullInputs(){
        assertThrows(IllegalArgumentException.class, () -> algorithms.areAnagrams(null, "a"));
        assertThrows(IllegalArgumentException.class, () -> algorithms.areAnagrams("a", null));
    }

}
