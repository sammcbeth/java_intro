public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        else{
            double area = Math.PI * radius * radius;
            return area;

        }
    }
    public static double area(double length, double height){
        if (length < 0 || height  < 0){
            return -1;
        }
        else{
            double area = length  * height;
            return area;
        }
    }
}
