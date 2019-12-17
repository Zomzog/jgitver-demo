package bzh.zomzog.jgitverdemo.subb;

import bzh.zomzog.jgitverdemo.suba.Pony;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypedPonyTest {

    @Test
    void hello() {
        Pony p = new TypedPony("Rainbow Dash", "Pegasi");

        assertEquals("TypedPony{name='Rainbow Dash', type='Pegasi'}", p.toString());
    }
}
