enum Direction {
    // Enum types
    EAST(0), WEST(180), NORTH(90), SOUTH(270);
   
    // Constructor
    private Direction(final int angle) {
      this.angle = angle;
    }
   
    // Internal state
    private int angle;
   
    public int getAngle() {
      return angle;
    }
  }