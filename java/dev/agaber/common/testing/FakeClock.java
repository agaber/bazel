package dev.agaber.common.testing;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public final class FakeClock extends Clock {
  private final Instant now;
  private final ZoneId zoneId;

  public FakeClock(Instant now, ZoneId zoneId) {
    this.now = now;
    this.zoneId = zoneId;
  }

  public FakeClock(LocalDate currentDate) {
    this(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant(), ZoneId.systemDefault());
  }

  @Override
  public ZoneId getZone() {
    return zoneId;
  }

  @Override
  public Clock withZone(ZoneId zoneId) {
    return new FakeClock(now, zoneId);
  }

  @Override
  public Instant instant() {
    return now;
  }
}
