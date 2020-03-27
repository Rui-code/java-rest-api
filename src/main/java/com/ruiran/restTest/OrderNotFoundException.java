package com.ruiran.restTest;

public class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Couldn't find order " + id);
    }

}
