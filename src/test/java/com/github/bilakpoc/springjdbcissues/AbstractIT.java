package com.github.bilakpoc.springjdbcissues;

import java.util.UUID;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public abstract class AbstractIT {
  
  protected final UUID ALISA_PEKERS = UUID.fromString("fd6fb204-1b6d-4a18-bcea-9da8aae47213");
  
}
