import java.util.Scanner;

class Sphere {
    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder {
    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Cube {
    public static double calculateVolume(double side) {
        return Math.pow(side, 3);
    }
}

class Cone {
    public static double calculateVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Vol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate its volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cube");
        System.out.println("4. Cone");

        int choice = sc.nextInt();

        double volume = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = sc.nextDouble();
                volume = Sphere.calculateVolume(sphereRadius);
                break;
            case 2:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = sc.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = sc.nextDouble();
                volume = Cylinder.calculateVolume(cylinderRadius, cylinderHeight);
                break;
            case 3:
                System.out.print("Enter the side length of the cube: ");
                double cubeSide = sc.nextDouble();  
                volume = Cube.calculateVolume(cubeSide);
                break;
            case 4:
                System.out.print("Enter the radius of the cone: ");
                double coneRadius = sc.nextDouble(); 
                System.out.print("Enter the height of the cone: ");
                double coneHeight = sc.nextDouble();
                volume = Cone.calculateVolume(coneRadius, coneHeight);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Volume of the selected shape is: " + volume);
    }
}
