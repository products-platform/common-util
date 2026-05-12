package com.product.exceptions;

public class InvalidRoleAssignmentException extends RuntimeException {
    public InvalidRoleAssignmentException(String message) {
        super(message);
    }
}
