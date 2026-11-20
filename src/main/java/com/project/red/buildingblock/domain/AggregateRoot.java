package com.project.red.buildingblock.domain;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;

@MappedSuperclass
public abstract class AggregateRoot extends BaseEntity {
  @Transient private final transient List<DomainEvent> domainEvents = new ArrayList<>();

  protected void registerEvent(@NonNull DomainEvent event) {
    domainEvents.add(event);
  }

  @DomainEvents
  protected Collection<DomainEvent> domainEvents() {
    return Collections.unmodifiableList(domainEvents);
  }

  @AfterDomainEventPublication
  protected void clearDomainEvents() {
    domainEvents.clear();
  }
}
