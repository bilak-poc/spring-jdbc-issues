package com.github.bilakpoc.springjdbcissues.data.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.bilakpoc.springjdbcissues.AbstractIT;
import com.github.bilakpoc.springjdbcissues.data.entity.QUserEntity;
import com.github.bilakpoc.springjdbcissues.data.entity.UserEntity;

class UserRepositoryTest extends AbstractIT {
  
  private final QUserEntity USER = QUserEntity.userEntity;
  
  @Autowired
  private UserRepository userRepository;
  
  @Test
  void testFindUser() {
    final Optional<UserEntity> userOpt = userRepository.findById(ALISA_PEKERS);
    
    assertThat(userOpt.isPresent(), is(true));
  }
  
  @Test
  void testQueryDsl() {
    final Optional<UserEntity> userOpt = userRepository.queryOne(
      q -> q.select(userRepository.entityProjection()).where(USER.firstName.eq("John")));
  
    assertThat(userOpt.isPresent(), is(true));
  }
  
}