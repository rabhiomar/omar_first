package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.models.UserPrincipalDetailsService;
import com.example.demo.services.MyUserDetailsService;



@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter  {
	private UserPrincipalDetailsService userPrincipalDetailsService;
	
	public ApplicationSecurityConfig(UserPrincipalDetailsService userPrincipalDetailsService) {
        this.userPrincipalDetailsService = userPrincipalDetailsService;
    }
	
	
	
	
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) {
	        auth.authenticationProvider(authenticationProvider());
	    }
	
	
	@Override
	protected void configure(HttpSecurity http) 
			throws Exception {
		http
		
		.authorizeRequests()
        .antMatchers("/indexx.html").permitAll()
        .antMatchers("/profile/**").authenticated()
        .antMatchers("/indexx").hasRole("role1")
        .antMatchers("/indexx").hasAnyAuthority("permissions1","permissions2")
        .antMatchers("/patients").hasAnyAuthority("permissions3","permissions4")
         .and()
		.csrf().disable()
		.authorizeRequests()
		.antMatchers(
				"/login", 
				"/resources/**", 
				"/css/**", 
				"/fonts/**", 
				"/img/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login").permitAll();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}	
	
	@Autowired
	//private UserDetailsService userDetailsService;
	private MyUserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();		
		provider.setUserDetailsService(userDetailsService);	
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
}