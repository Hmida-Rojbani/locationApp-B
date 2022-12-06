package de.tekup.locationappb.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

     @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/","/css/**","/js/**","/fonts/**","/images/**","/scss/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and().formLogin();

    }
}
