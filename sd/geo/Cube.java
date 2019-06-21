package sd.geo;
import sd.geo.formula.GeometryFormula;

public class Cube implements GeometryFormula {

  private final double length;

  public Cube(double length) {
    this.length = length;
  }

  @Override
  public double getArea() {
    return 6 * Math.pow(length, 2);
  }

  @Override
  public double getVolume() {
    return Math.pow(length, 3);
  }

}
