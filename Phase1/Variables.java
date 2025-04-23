public class Variables {
  public static void main(String[] args) {
    String name = "John";
    System.out.println(name);
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    // System.out.println(cadence, speed, gear);
    System.out.println("方法 1：字串串接");
    System.out.println("Cadence: " + cadence + ", Speed: " + speed + ", Gear: " + gear);
    System.out.println("方法 2：使用 String.format()");
    System.out.println(String.format("Cadence: %d, Speed: %d, Gear: %d", cadence, speed, gear));
    System.out.println("方法 3：使用 System.out.printf()");
    System.out.printf("Cadence: %d, Speed: %d, Gear: %d%n", cadence, speed, gear);

    double value 114.514;
  }
}

// Instance Variables (Non-Static Fields)
// Class Variables (Static Fields)
// Local Variables
// Parameters 