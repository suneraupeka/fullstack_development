package com.sunera.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Cann't foud any user by this id"+ id);

    }
}
