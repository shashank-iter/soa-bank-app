package com.shashank.bankapp.springbankapp.authorisation;

import com.shashank.bankapp.springbankapp.domain.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @project spring-bank-app
 * @autor shashank on 2020-01-13
 */
public class CustomUserDetails extends User implements UserDetails {

    public CustomUserDetails(User user) {
        super(user);

    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return super.getRoles();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
