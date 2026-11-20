package com.project.red.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
class SecurityConfig {
  private static final String[] PUBLIC_PATHS = {
    "/error",
    "/actuator/health/**",
    "/actuator/info",
    "/actuator/modulith",
    "/swagger-ui.html",
    "/swagger-ui/**",
    "/v3/api-docs/**"
  };

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http.authorizeHttpRequests(
            it -> it.requestMatchers(PUBLIC_PATHS).permitAll().anyRequest().authenticated())
        .build();
  }
}
