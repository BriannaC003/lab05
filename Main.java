import java.util.Scanner;


public class Main
{

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter length of rectangle (positive integer): ");
        double length = scnr.nextDouble();

        System.out.print("Enter width of rectangle (positive integer): ");
        double width = scnr.nextDouble();

        System.out.print("Now enter the radius of the circle (positive integer): ");
        double radius = scnr.nextDouble();

        System.out.print("Enter side A of triangle (positive integer): ");
        double A = scnr.nextDouble();

        System.out.print("Enter side B of triangle (positive integer): ");
        double B = scnr.nextDouble();

        System.out.print("Enter side C of triangle (positive integer): ");
        double C = scnr.nextDouble();


        double pi = 3.14;
        double S = (A + B + C)/ 2;





        System.out.println("Area of rectangle: " + length * width);
        System.out.println("Area of circle: " + pi * radius * radius);
        System.out.println("Perimeter of rectangle: " + 2 * (length + width));
        System.out.println("Circumference of circle: " + 2 * pi * radius);
        System.out.println("Area of triangle: " + Math.sqrt(S * (S - A) * (S - B) * (S - C)));
        System.out.println("Perimeter of triangle: " + (A + B + C));



        System.out.print("Enter the radius of the sphere: ");
        double r = scnr.nextDouble();

        System.out.print("Enter the diameter of the rectangular prism: ");
        double diameter = scnr.nextDouble();

        System.out.print("Enter the height of the rectangular prism: ");
        double rectheight = scnr.nextDouble();

        System.out.print("Enter the width of the rectangular prism: ");
        double rectwidth = scnr.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scnr.nextDouble();

        System.out.print("Enter the radius of the cylinder: ");
        double cylradius = scnr.nextDouble();



        System.out.println("The surface area of the sphere is: " + 4 * pi * r * r);
        System.out.println("The volume of the sphere is: " + 4 * pi * (r * r * r / 3));
        System.out.println("The surface area of the rectangular prism is: " + 2 * ((rectheight * diameter) + (rectheight * rectwidth) + (diameter * rectwidth)));
        System.out.println("The volume of the rectangular prism is: " + (rectheight * diameter * rectwidth));
        System.out.println("The surface area of the cylinder is: " + ((2 * pi * cylradius * height) + (2 * pi * cylradius * cylradius)));
        System.out.println("The volume of the cylinder is: " + (pi * cylradius * cylradius * height));


    }


}
