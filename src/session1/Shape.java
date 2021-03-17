package session1;

public abstract class Shape {
    abstract double computeArea();
    abstract double getWidth();
    abstract double getHeight();
    abstract void setHeight(double height) throws Exception;
    abstract void setWidth(double width) throws Exception;
    void checkInput(double input) throws Exception {
        if(input <= 0){
            throw new Exception("Invalid Input");
        }
    }
}
