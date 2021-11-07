import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dec2HexTest {

    @Test
    void validateNoArgumentPassed() {
        Dec2Hex.main(new String[] {});
    }

    @Test
    void validateInputWithNonInt() {
        Dec2Hex.validateInput("test"); //should return "Input invalid. Must be a positive integer."
    }

    @Test
    void validateInputWithNoInput() {
        Dec2Hex.validateInput(""); //should return "Input invalid. Must be a positive integer."
    }

    @Test
    void validateInputWithLowInt(){
        Dec2Hex.validateInput("16"); //should be 10
    }

    @Test
    void validateInputWithHighInt(){
        Dec2Hex.validateInput("135484153"); //should be 81352F9
    }

    @Test
    void convertInput() {
    }
}
