package dev.agaber.bazel;

import java.time.Clock;
import java.time.LocalDate;

final class Application {
  private final Clock clock;

  Application(Clock clock) {
    this.clock = clock;
  }

  public String getMessage() {
    return String.format("Message created on %s", LocalDate.now(clock));
  }

  public static void main(String... args) {
    var app = new Application(Clock.systemUTC());
    System.out.println(app.getMessage());
  }
}
