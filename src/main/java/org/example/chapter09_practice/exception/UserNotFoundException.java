package org.example.chapter09_practice.exception;

public class UserNotFoundException extends RuntimeException {
    // 실행 이전에는 예외 발생 X
    public UserNotFoundException(String message) {
        super(message);
    }
}
