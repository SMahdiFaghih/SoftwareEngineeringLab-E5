package Builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBuilderPattern {
    @Test

    public  void ComputerTest() {

        Computer comp = new Computer.ComputerBuilder(
                "1000 GB").build();
        Assertions.assertEquals("1000 GB",comp.getHDD());
    }
}
