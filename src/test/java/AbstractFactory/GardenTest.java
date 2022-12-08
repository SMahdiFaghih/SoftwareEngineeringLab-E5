package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GardenTest
{
    @Test
    public void iranianGardenTest()
    {
        Garden garden = new Garden(AbstractGarden.Iranian);
        assertEquals(AbstractTree.Chenar, garden.getTree());
        assertEquals(AbstractFlower.Khatmi, garden.getFlower());
    }

    @Test
    public void japaneseGardenTest()
    {
        Garden garden = new Garden(AbstractGarden.Japanese);
        assertEquals(AbstractTree.J1, garden.getTree());
        assertEquals(AbstractFlower.G1, garden.getFlower());
    }
}