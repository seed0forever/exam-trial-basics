package box;

public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume

  float width, height, depth;

  public Cuboid(float width, float height, float depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public float getSurface() {
    return 2f * (width * height
            + width * depth
            + height * depth);
  }

  public float getVolume() {
    return width * height * depth;
  }
}
