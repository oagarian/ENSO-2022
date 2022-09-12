package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Controller controller = new Controller();
    assertEquals("Welcome to Jooby!", controller.sayHi());
  }
}
