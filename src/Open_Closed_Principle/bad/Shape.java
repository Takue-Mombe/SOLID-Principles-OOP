package Open_Closed_Principle.bad;
/*
 * We should design our code in a way that allows us to add
 * new features without changing the existing code
 *
 * The shape class violets the OCP because it requires modification
 * whenever a new shape is added
 *
 */

public class Shape {
    String type;
    public Shape(String type){
        this.type=type;
    }
    public double CalcArea(double height,double width, double radius){
        if(type.equals("Circle")){
            //calculates the area for circle
            return Math.PI*radius*radius;
        } else if (type.equals("rectangle")) {
            //calculates the area for rectangle
            return height*width;
        }
        return 0.0;
    }
}
