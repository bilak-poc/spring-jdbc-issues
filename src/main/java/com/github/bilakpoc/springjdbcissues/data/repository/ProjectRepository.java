package com.github.bilakpoc.springjdbcissues.data.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.github.bilakpoc.springjdbcissues.data.entity.ProjectEntity;
import com.infobip.spring.data.jdbc.QuerydslJdbcRepository;

public interface ProjectRepository extends QuerydslJdbcRepository<ProjectEntity, UUID> {
  
  Page<ProjectEntity> findAllByOwner(UUID owner, Pageable pageable);
  
}
