package sd.geo;
import sd.geo.formula.GeometryFormula;

public class Sphere implements GeometryFormula {

  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double getVolume() {
    return (4 * Math.PI * Math.pow(radius, 3)) / 3;
  }

}
