package session1;

public class Square extends Shape{
    private double edge;
    public Square(double edge) throws Exception {
        try {
            checkInput(edge);
            this.setHeight(edge);
            this.setWidth(edge);
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }
    }

    @Override
    double computeArea() {
        return edge * edge;
    }

    @Override
    double getWidth() {
        return edge;
    }

    @Override
    double getHeight() {
        return edge;
    }

    @Override
    void setHeight(double height) throws Exception {
        try {
            checkInput(height);
            this.edge = height;
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }
    }

    @Override
    void setWidth(double width) throws Exception {
        try {
            checkInput(width);
            this.edge = width;
        }catch (Exception e){
            throw new Exception("Invalid Input");
        }
    }
}
