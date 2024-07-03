package enums;

public class Main {
    public static void main(String[] args) {
        Planet favoritePlanet = Planet.MARS; // Setting favoritePlanet to Planet.MARS

        // Checking if the favorite planet is Earth
        if (favoritePlanet == Planet.EARTH) {
            System.out.println("We are on earth"); // Printing if the favorite planet is Earth
        } else {
            System.out.println("Exploring " + favoritePlanet); // Printing if the favorite planet is not Earth
        }

        // Iterating over all planets in the Planet enum
        for (Planet p : Planet.values()) {
            // Printing details of each planet (mass and diameter)
            System.out.printf("Planet %s, mass: %f, diameter: %f %n", p, p.getMass(), p.getDiameter());
        }

        // Retrieving a planet using its name
        Planet selectedPlanet = Planet.valueOf("MARS");
        // Printing the diameter and mass of the selected planet
        System.out.println(selectedPlanet.getDiameter() + " " + selectedPlanet.getMass());
    }
}