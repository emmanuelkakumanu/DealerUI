package com.cts.ZuulGateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
@CrossOrigin
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private AppUserDetailsService appUserDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stu
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
	}

	private PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();

	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		// TODO Auto-generated method stub
		httpSecurity.cors();

		httpSecurity.csrf().disable().httpBasic().and().authorizeRequests()
				.antMatchers("/series-model-service/cars/series").permitAll()
				.antMatchers("/series-model-service/cars/series/models").permitAll()
				.antMatchers("/series-model-service/cars/series/{id}/getmodels").permitAll()
				.antMatchers("/color-service/colors/getcolors/{id}").permitAll()
				.antMatchers("/accessory-service/accessories/getaccessory/{id}").permitAll()
				.antMatchers("/order-service/allorders").permitAll().antMatchers("/order-service/placeorder")
				.permitAll().anyRequest().authenticated().and()
				.addFilter(new JwtAuthorizationFilter(authenticationManager()));

	}

}
