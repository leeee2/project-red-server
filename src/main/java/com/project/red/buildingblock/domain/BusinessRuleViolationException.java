package com.project.red.buildingblock.domain;

import lombok.NonNull;

public class BusinessRuleViolationException extends RuntimeException {
  public BusinessRuleViolationException(@NonNull BusinessRule rule) {
    super(rule.getMessage());
  }
}
