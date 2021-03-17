package session1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void constructorInstanceofTest() throws Exception {
        Shape square = new Square(10);
        assertTrue(square instanceof Square);
    }
    @Test
    void constructorInvalidInputTest() throws Exception{
        try {
            new Square(-4);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }
    @Test
    void computeAreaTest() throws Exception{
        Shape square = new Square(3.5);
        assertEquals(12.25, square.computeArea(), "Area = 10.5");
    }
    @Test
    void setWidthInvalidInputTest() throws Exception{
        Shape square = new Square(4);
        try {
            square.setWidth(0);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }

    @Test
    void setHeightInvalidInputTest() throws Exception{
        Shape square = new Square(6.9);
        try {
            square.setHeight(-5.5);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }
    @Test
    void setWidthValidInputTest() throws Exception{
        Shape square = new Square(9);
        square.setWidth(6.5);
        assertEquals(6.5, square.getWidth(), "width = 6.5");
        assertEquals(6.5, square.getHeight(), "height = 6.5");
    }

    @Test
    void setHeightValidInputTest() throws Exception{
        Shape square = new Square(7);
        square.setHeight(6.5);
        assertEquals(6.5, square.getWidth(), "width = 6.5");
        assertEquals(6.5, square.getHeight(), "height = 6.5");
    }

    @Test
    void getHeightTest() throws Exception{
        Shape square = new Square(6.7);
        assertEquals(6.7, square.getHeight());
    }

    @Test
    void getWidthTest() throws Exception{
        Shape square = new Square(6.7);
        assertEquals(6.7, square.getHeight());
    }
}
