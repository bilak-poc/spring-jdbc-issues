package com.github.bilakpoc.springjdbcissues.data.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.github.bilakpoc.springjdbcissues.AbstractIT;
import com.github.bilakpoc.springjdbcissues.data.entity.ProjectEntity;

class ProjectRepositoryTest extends AbstractIT {
  
  @Autowired
  private ProjectRepository projectRepository;
  
  @Test
  void testPaging() {
    final Page<ProjectEntity> projectsPage = projectRepository.findAllByOwner(ALISA_PEKERS, PageRequest.of(0, 1));
    assertThat(projectsPage, notNullValue());
    assertThat(projectsPage.getContent().size(), is(1));
  }
  
}