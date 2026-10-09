class Shape {
    public double getArea() {
        return 0;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
} 
class Square extends Shape{
    private double sides;
    public Square(double sides){
    this.sides = sides;
    }
    public double getArea(){
        return sides * sides;
    }
}
class Main{
    public static void main(String args[]){
        Shape[] shape= new Shape[2];
        shape[0] = new Square(5);
        shape[1] = new Triangle(2,2);
        System.out.println("Area of square" + shape[0].getArea());
        System.out.println("Area of triangle" + shape[1].getArea());
    }
}