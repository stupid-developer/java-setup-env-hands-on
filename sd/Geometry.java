package sd;
import sd.geo.Cube;
import sd.geo.Sphere;
import sd.geo.formula.GeometryFormula;

public class Geometry {

  public static void main(String[] args) {
    double radius = Double.valueOf(args[0]);
    double length = Double.valueOf(args[1]);

    GeometryFormula sphereGeometry = new Sphere(radius);
    GeometryFormula cubeGeometry = new Cube(length);

    System.out.println("area of the sphere : " + sphereGeometry.getArea());
    System.out.println("area of the cube : " + cubeGeometry.getArea());

    System.out.println("==========================");

    System.out.println("volume of the sphere : " + sphereGeometry.getVolume());
    System.out.println("volume of the cube : " + cubeGeometry.getVolume());

  }

}
