package ru.skypro;

public class WrongPasswordException extends RuntimeException {
    private final String exception;

    public WrongPasswordException() {
        exception = " пароли не совпадают.";
    }

    public String toString() {
        return "Ќеверно задан пароль:" + exception;
    }

}
