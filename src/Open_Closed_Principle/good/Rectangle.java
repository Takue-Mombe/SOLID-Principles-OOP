package Open_Closed_Principle.good;

public class Rectangle implements Shape{

    double width,height;
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }
}
