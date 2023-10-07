package dev.agaber.bazel;

import static org.assertj.core.api.Assertions.assertThat;

import dev.agaber.common.testing.FakeClock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

final class ApplicationTest {
  private Application app;

  @BeforeEach
  void beforeEach() {
    app = new Application(new FakeClock(LocalDate.of(2020, 1, 1)));
  }

  @Test
  void getMessage() {
    assertThat(app.getMessage()).isEqualTo("Message created on 2020-01-01");
  }
}
