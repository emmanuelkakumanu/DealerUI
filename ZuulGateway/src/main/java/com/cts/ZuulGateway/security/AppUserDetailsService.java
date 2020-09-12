package com.cts.ZuulGateway.security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.ZuulGateway.repository.UserRepository;
import com.cts.model.User;

@Service
public class AppUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.getUserByUserName(userName);
		
		if (user == null)
			throw new UsernameNotFoundException("User does not exist!!");
		else
			return new AppUser(user);
	}

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	@Transactional
	 public User findByUserName(String username) {
	 return userRepository.getUserByUserName(username);

	 }	
}
