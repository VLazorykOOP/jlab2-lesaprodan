public class Main {

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
	// write your code here
	    import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    public boolean equals(Rectangle other) {
        return this.length == other.length && this.width == other.width;
    }

    public boolean isSimilar(Rectangle other) {
        return (this.length / this.width == other.length / other.width) &&
               (this.length / this.width == other.width / other.length) &&
               (this.width / this.length == other.width / other.length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first rectangle: ");
        double length1 = input.nextDouble();

        System.out.print("Enter the width of the first rectangle: ");
        double width1 = input.nextDouble();

        Rectangle rectangle1 = new Rectangle(length1, width1);

        System.out.print("Enter the length of the second rectangle: ");
        double length2 = input.nextDouble();

        System.out.print("Enter the width of the second rectangle: ");
        double width2 = input.nextDouble();

        Rectangle rectangle2 = new Rectangle(length2, width2);

        System.out.println("Perimeter of the first rectangle: " + rectangle1.getPerimeter());
        System.out.println("Area of the first rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter of the second rectangle: " + rectangle2.getPerimeter());
        System.out.println("Area of the second rectangle: " + rectangle2.getArea());

        if (rectangle1.getArea() == rectangle2.getArea()) {
            System.out.println("The rectangles have the same area.");
        } else if (rectangle1.getArea() > rectangle2.getArea()) {
            System.out.println("The first rectangle has a greater area.");
        } else {
            System.out.println("The second rectangle has a greater area.");
        }

        if (rectangle1.getPerimeter() == rectangle2.getPerimeter()) {
            System.out.println("The rectangles have the same perimeter.");
        } else if (rectangle1.getPerimeter() > rectangle2.getPerimeter()) {
            System.out.println("The first rectangle has a greater perimeter.");
        } else {
            System.out.println("The second rectangle has a greater perimeter.");
        }

        if (rectangle1.isSimilar(rectangle2)) {
            System.out.println("The rectangles are similar.");
        } else {
            System.out.println("The rectangles are not similar.");
        }
    }
}


    }
}
