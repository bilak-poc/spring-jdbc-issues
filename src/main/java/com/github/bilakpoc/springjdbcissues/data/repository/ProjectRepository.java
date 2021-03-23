package com.github.bilakpoc.springjdbcissues.data.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.github.bilakpoc.springjdbcissues.data.entity.ProjectEntity;

public interface ProjectRepository extends PagingAndSortingRepository<ProjectEntity, UUID> {
  
  Page<ProjectEntity> findAllByOwner(UUID owner, Pageable pageable);
  
}
