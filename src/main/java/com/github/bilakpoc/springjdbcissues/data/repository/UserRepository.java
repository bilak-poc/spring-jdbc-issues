package com.github.bilakpoc.springjdbcissues.data.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.github.bilakpoc.springjdbcissues.data.entity.UserEntity;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, UUID> {

}
