package ru.skypro;

public class WrongPasswordException extends RuntimeException {
    private final String exception;

    public WrongPasswordException() {
        exception = " ������ �� ���������.";
    }

    public String toString() {
        return "������� ����� ������:" + exception;
    }

}
