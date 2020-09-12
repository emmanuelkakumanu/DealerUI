package com.cts.SeriesModelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String username);

}
