import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() {
        g1 = new GradeBook(2);
        g1.addScore(50.0);
        g1.addScore(75.0);
        g2 = new GradeBook(2);
        g2.addScore(25.0);
        g2.addScore(90.0);
    }

    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        assertEquals(125.0, g1.sum(), 0.01); 
        assertEquals(115.0, g2.sum(), 0.01); 
    }

    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.01);
        assertEquals(115.0, g2.sum(), 0.01);
    }

    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.01);
        assertEquals(25.0, g2.minimum(), 0.01);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.01); 
        assertEquals(90.0, g2.finalScore(), 0.01); 
    }
}
