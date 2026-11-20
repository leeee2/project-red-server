package com.project.red.buildingblock.domain;

import java.time.Instant;
import java.util.UUID;

public interface DomainEvent {
  UUID id();

  Instant occurredAt();
}
