package mike706574;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void twoPlusTwo() {
        assertEquals( "2 + 2 should equal 4",
                      4,
                      new App().add( 2, 2 ) );
    }
}
