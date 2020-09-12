package com.cts.ZuulGateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "select * from user where us_name=?1", nativeQuery = true)
	public User getUserByUserName(String userName);

	

}
