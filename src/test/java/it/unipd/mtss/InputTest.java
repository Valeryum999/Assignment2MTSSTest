////////////////////////////////////////////////////////////////////
// Valeri Mihail Belenkov 2068232
// Matteo Piron 2076044
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.*;

public class InputTest {
    
    @Test
    public void BasicTest() {
        assert(1 == 1);
    }

    @Test
    public void IntegerToRoman_1_to_I() {
        assert(IntegerToRoman.convert(1).equals("I"));
    }
    @Test
    public void IntegerToRoman_5_to_V() {
        assert(IntegerToRoman.convert(5).equals("V"));
    }
    @Test
    public void IntegerToRoman_10_to_X() {
        assert(IntegerToRoman.convert(10).equals("X"));
    }
    @Test
    public void IntegerToRoman_50_to_L() {
        assert(IntegerToRoman.convert(50).equals("L"));
    }
    @Test
    public void IntegerToRoman_100_to_C() {
        assert(IntegerToRoman.convert(100).equals("C"));
    }
    @Test
    public void IntegerToRoman_500_to_D() {
        assert(IntegerToRoman.convert(500).equals("D"));
    }
    @Test
    public void IntegerToRoman_1000_to_M() {
        assert(IntegerToRoman.convert(1000).equals("M"));
    }
}
