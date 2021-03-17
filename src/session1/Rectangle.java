package session1;
public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double width, double height) throws Exception {
        try {
            checkInput(width);
            checkInput(height);
            this.setHeight(height);
            this.setWidth(width);
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }
    }

    public double computeArea(){
        return width * height;
    }

    public void setHeight(double height) throws Exception {
        try {
            checkInput(height);
            this.height = height;
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }

    }
    public void setWidth(double width) throws Exception {
        try {
            checkInput(width);
            this.width = width;
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
}
