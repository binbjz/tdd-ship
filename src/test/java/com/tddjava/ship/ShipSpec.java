package com.tddjava.ship;

import org.testng.annotations.*;
import java.util.ArrayList;
import static org.testng.Assert.*;

@Test
public class ShipSpec {
    private Ship ship;
    private Point max;
    private ArrayList<Point> obstacles;
    private Location location;

    @BeforeMethod
    public void beforeTest() {
        max = new Point(100, 100);
        obstacles = new ArrayList<>();
        location = new Location(new Point(50, 50), Direction.NORTH);
        ship = new Ship(location, new Planet(max, obstacles));
    }

    public void whenMoveForwardThenLocationChanges() {
        ship.moveForward();
        assertEquals(ship.getLocation().getY(), 49); // Assuming NORTH decreases Y
    }

    public void whenMoveBackwardThenLocationChanges() {
        ship.moveBackward();
        assertEquals(ship.getLocation().getY(), 51); // Assuming NORTH increases Y on backward
    }

    public void whenTurnLeftThenDirectionChanges() {
        ship.turnLeft();
        assertEquals(ship.getLocation().getDirection(), Direction.WEST);
    }

    public void whenTurnRightThenDirectionChanges() {
        ship.turnRight();
        assertEquals(ship.getLocation().getDirection(), Direction.EAST);
    }

    public void whenGetPlanetThenCorrectPlanetReturned() {
        Planet expectedPlanet = new Planet(max, obstacles);
        Ship ship = new Ship(location, expectedPlanet);
        assertEquals(ship.getPlanet(), expectedPlanet, "The returned planet should be the one that was set in the constructor.");
    }
    // Can add more test cases as needed.
}
