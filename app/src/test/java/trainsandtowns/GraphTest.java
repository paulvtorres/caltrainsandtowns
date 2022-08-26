/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package trainsandtowns;

import java.util.function.Predicate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Paul
 */
public class GraphTest {

    static Graph instance;

    public GraphTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        GraphTest.instance = new Graph("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDistance method, of class Graph.
     */
    @Test
    public void testGetDistance_1() {
        System.out.println("getDistance_1");
        String route = "ABC";
        String expResult = "9";
        String result = GraphTest.instance.getDistance(route);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance_2() {
        System.out.println("getDistance_2");
        String route = "AD";
        String expResult = "5";
        String result = GraphTest.instance.getDistance(route);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance_3() {
        System.out.println("getDistance_3");
        String route = "ADC";
        String expResult = "13";
        String result = GraphTest.instance.getDistance(route);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance_4() {
        System.out.println("getDistance_4");
        String route = "AEBCD";
        String expResult = "22";
        String result = GraphTest.instance.getDistance(route);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance_5() {
        System.out.println("getDistance_5");
        String route = "AED";
        String expResult = "NO SUCH ROUTE";
        String result = GraphTest.instance.getDistance(route);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTripsCount_1() {
        System.out.println("calculateTripsCount 1");
        String from = "C";
        String to = "C";
        Predicate<Integer> predicate = t -> t <= 3;
        int stops = 3;
        int expResult = 2;
        int result = GraphTest.instance.calculateTripsCount(from, to, predicate, stops);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateTripsCount_2() {
        System.out.println("calculateTripsCount 2");
        String from = "A";
        String to = "C";
        Predicate<Integer> predicate = t -> t == 4;
        int stops = 4;
        int expResult = 3;
        int result = GraphTest.instance.calculateTripsCount(from, to, predicate, stops);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateShortRoute_1() {
        System.out.println("calculateShortRoute 1");
        String from = "A";
        String to = "C";
        int expResult = 9;
        int result = GraphTest.instance.calculateShortRoute(from, to);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateShortRoute_2() {
        System.out.println("calculateShortRoute 2");
        String from = "B";
        String to = "B";
        int expResult = 9;
        int result = GraphTest.instance.calculateShortRoute(from, to);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateRoutesCount() {
        System.out.println("calculateRoutesCount");
        String from = "C";
        String to = "C";
        int maxDistance = 30;
        int expResult = 7;
        int result = GraphTest.instance.calculateRoutesCount(from, to, maxDistance);
        assertEquals(expResult, result);
    }
}
