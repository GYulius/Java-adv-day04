package enums;

public enum Planet { // Enum class to represent planets
    MERCURY(0.330e+24, 4879), // 1 Enum constant with mass and diameter
    VENUS(4.87e+24, 12104),   // 2 Enum constant with mass and diameter
    EARTH(5.97e+24, 12756),   // 3  Enum constant with mass and diameter
    MARS(0.642e+24, 6792);    // 4  Enum constant with mass and diameter

    private final double mass; // Mass of the planet in kg
    private final double diameter; // Diameter of the planet in km

    // Constructor to initialize mass and diameter
    Planet(double mass, double diameter) {
        this.mass = mass;
        this.diameter = diameter;
    }

    // Getter method for mass
    public double getMass() {
        return mass;
    }

    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }
}