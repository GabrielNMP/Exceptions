package ru.skypro;

public class WrongLoginException extends RuntimeException {
    private final String exception;

    public WrongLoginException() {
        exception = "Длинна логина не должна превышать 20 символов.";
    }

    public String toString() {
        return "Неверно задан логин: " + exception;
    }
}
