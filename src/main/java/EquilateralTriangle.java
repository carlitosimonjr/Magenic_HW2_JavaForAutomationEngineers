import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {

    /**
     * The base of the triangle
     */
    private double base;

    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    /**
     * Gets the base of the triangle
     * @return The base
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the Base
     * @param base The Base of a triangle
     */
    public void setBase(double base) {

        if (base > 0)
            this.base = base;
        else
            System.out.println("You must enter a valid value");
    }

    /**
     * Calculates the height of the triangle object
     * @return The height of the triangle
     */
    public double height() {
        return Math.sqrt(3) * base / 2;
    }

    /**
     * Calculates the area of the triangle object
     * @return The area of the triangle
     */
    public double area() {
        return (base * height()) / 2;
    }

    /**
     * Calculates the perimeter of the triangle object
     * @return The perimeter of the triangle
     */
    public double perimeter() {
        return 3 * base;
    }

    /**
     * The main method for the EquilateralTriangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        EquilateralTriangle e = new EquilateralTriangle();

        System.out.println("Enter side of Triangle:");
        //Capture the user's input
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        double baseLength = scanner.nextDouble();

        e.setBase(baseLength);

        double area = e.area();
        double perimeter = e.perimeter();

        System.out.println("A triangle with side length of " + e.getBase() + " has an area of: " + area);
        System.out.println("A triangle with side length of " + e.getBase() + " has a perimeter of: " + perimeter);
    }
}