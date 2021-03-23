package com.github.bilakpoc.springjdbcissues.data.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("users")
public class UserEntity {
  
  @Id
  private UUID id;
  
  private String firstName;
  
  private String lastName;
}
