package com.project.red.buildingblock.domain;

public interface BusinessRule {
  boolean isBroken();

  String getMessage();
}
