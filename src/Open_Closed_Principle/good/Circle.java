package Open_Closed_Principle.good;

public class Circle implements Shape{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
