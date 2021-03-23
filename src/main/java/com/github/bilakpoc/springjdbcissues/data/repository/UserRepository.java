package com.github.bilakpoc.springjdbcissues.data.repository;

import java.util.List;
import java.util.UUID;

import com.github.bilakpoc.springjdbcissues.data.entity.QUserEntity;
import com.github.bilakpoc.springjdbcissues.data.entity.UserEntity;
import com.infobip.spring.data.jdbc.QuerydslJdbcRepository;

public interface UserRepository extends QuerydslJdbcRepository<UserEntity, UUID> {
  
  QUserEntity USER = QUserEntity.userEntity;
  
  default List<UserEntity> findByName(String name) {
    final String fulltext = "%".concat(name).concat("%");
    return queryMany(q -> q
      .select(entityProjection())
      .from(USER)
      .where(USER.firstName.lower().like(fulltext).or(USER.lastName.lower().like(fulltext))));
  }
  
}
