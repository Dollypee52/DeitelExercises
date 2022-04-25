package GasMileageTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GasTest {
    @Test
    public void gasTankExistedTest(){
        Gas gas = new Gas();
        assertNotNull(gas);

    }

}
