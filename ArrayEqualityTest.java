import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };  // Varmista, että molemmissa taulukoissa on samat arvot
        assertArrayEquals(a1, a2);  // Tämä pitäisi nyt läpäistä
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };  // Odotetut arvot
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };  // Testattavat arvot, varmista että arvot täsmäävät
        assertArrayEquals(a11, a12);  // Tämä pitäisi nyt läpäistä
    }

    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2);  // Tämä testi läpäisee, koska merkkijonotaulukot ovat samat
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };  // Korjattu arvo
        assertArrayEquals(d1, d2);  // Tämä pitäisi nyt läpäistä
    }
}
