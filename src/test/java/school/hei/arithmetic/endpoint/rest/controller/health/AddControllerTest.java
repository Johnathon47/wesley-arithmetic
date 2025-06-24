package school.hei.arithmetic.endpoint.rest.controller.health;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddControllerTest {
    private final AddController subject = new AddController();
    @Test
    public void add() {
        assertEquals(3, subject.add(1,2));
    }
}
