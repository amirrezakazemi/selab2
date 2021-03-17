package session1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void constructorInstanceofTest() throws Exception {
        Shape rectangle = new Rectangle(10, 5);
        assertTrue(rectangle instanceof Rectangle);
    }
    @Test
    void constructorInvalidInputTest() throws Exception{
        try {
            new Rectangle(-2, -3);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }
    @Test
    void computeAreaTest() throws Exception{
        Shape rectangle = new Rectangle(3, 5);
        assertEquals(15, rectangle.computeArea(), "Area = 15");
    }
    @Test
    void setWidthInvalidInputTest() throws Exception{
        Shape rectangle = new Rectangle(4, 5);
        try {
            rectangle.setWidth(0);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }

    @Test
    void setHeightInvalidInputTest() throws Exception{
        Shape rectangle = new Rectangle(4, 5);
        try {
            rectangle.setHeight(-5);
        }catch (Exception e){
            assertTrue(e.getMessage().contains("Invalid Input"));
        }
    }
    @Test
    void setWidthValidInputTest() throws Exception{
        Shape rectangle = new Rectangle(4, 5);
        rectangle.setWidth(6.5);
        assertEquals(6.5, rectangle.getWidth(), "width = 6.5");
    }

    @Test
    void setHeightValidInputTest() throws Exception{
        Shape rectangle = new Rectangle(4, 5);
        rectangle.setHeight(22.1);
        assertEquals(22.1, rectangle.getHeight(), "height = 22.1");
    }

    @Test
    void getHeightTest() throws Exception{
        Shape rectangle = new Rectangle(6.7, 3.1);
        assertEquals(3.1, rectangle.getHeight());
    }

    @Test
    void getWidthTest() throws Exception{
        Shape rectangle = new Rectangle(6.7, 3.1);
        assertEquals(6.7, rectangle.getWidth());
    }
}
