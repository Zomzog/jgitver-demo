package bzh.zomzog.jgitverdemo.suba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PonyTest {

    @Test
    void hello() {
        Pony p = new Pony("Rainbow Dash");

        assertEquals("Pony{name='Rainbow Dash'}", p.toString());
    }
}
