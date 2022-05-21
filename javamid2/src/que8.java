abstract class figure {
    double d1;
    double d2;

    public figure(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public abstract double area();

}

class Rectangle extends figure {

    public Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    public double area() {
        return d1 * d2;
    }
}

class Triangle extends figure {

    public Triangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    public double area() {
        return (d1 * d2) / 2;
    }
}

public class que8 {
    public static void main(String[] args) {
        figure t = new Triangle(10,20);
        figure r = new Rectangle(10,20);

        System.out.println("Area of triangle is : " + t.area());
        System.out.println("Area of rectangle is : " + r.area());
    }
}
