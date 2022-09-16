import java.util.Scanner;

abstract class Geometricobject{

    String color;
    boolean filled;

    
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();


}

class Circle extends Geometricobject{

    double radius;
    Circle()
    {
        radius=1;
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        System.out.println("The area of Circle is "+3.14*radius*radius);
        return 0;
    }
    @Override
    double getPerimeter() {
        System.out.println("The perimeter of Circle is "+3.14*radius*radius);
        return 0;
    }

    void display(){
        System.out.println("your color is "+getColor());
        System.out.println("your object is filled :"+isFilled());
        getArea();
        getPerimeter();
    }
}

class Rectangle extends Geometricobject{

    double width;
    double height;

    Rectangle(){
        width=1;
        height=1;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
       System.out.println("The area of Rectangle is "+width*height);
        return 0;
    }
    @Override
    double getPerimeter() {
        System.out.println("The perimeter of Rectangle is "+2*(width+height));
        return 0;
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }
    
    void display(){
        System.out.println("your color is "+getColor());
        System.out.println("your object is filled :"+isFilled());
        getArea();
        getPerimeter();
    }
}

class prac3_1{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        Circle c=new Circle();
         
        double r;
        String col;
        
        System.out.println("Enter radius :");
        r=s.nextDouble();
        System.out.println("Enter color :");
        col=s.next();
       
        c.setRadius(r);
        c.setColor(col);

        c.display();

        Rectangle rec=new Rectangle();

        double wid;
        double hei;

        System.out.println("Enter height :");
        hei=s.nextDouble();
        System.out.println("Enter width :");
        wid=s.nextDouble();
        System.out.println("Enter color :");
        col=s.next();

        rec.setColor(col);
        rec.setHeight(hei);
        rec.setWidth(wid);

        rec.display();

        
    }
}