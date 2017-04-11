package box;

public class BoxTestApp {

  public static void main(String[] args) {
    Cuboid cuboid1 = new Cuboid(10, 10, 10);
    System.out.println(cuboid1.getVolume());
    System.out.println(cuboid1.getSurface());
  }

}
