package session1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    void checkInput(){
        Shape shape = new Shape() {
            @Override
            double computeArea() {
                return 0;
            }

            @Override
            double getWidth() {
                return 0;
            }

            @Override
            double getHeight() {
                return 0;
            }

            @Override
            void setHeight(double height) {

            }

            @Override
            void setWidth(double width) {

            }
        };
        Exception e = assertThrows(Exception.class, () -> {shape.checkInput(-10);});
        assertTrue(e.getMessage().contains("Invalid Input"));
    }
}
