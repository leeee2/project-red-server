package com.project.red;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTest {
  private static final ApplicationModules MODULES = ApplicationModules.of(RedApplication.class);

  @Test
  void printsAndVerifiesModuleStructure() {
    MODULES.forEach(System.out::println);
    MODULES.verify();
  }
}
