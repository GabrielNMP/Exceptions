package ru.skypro;

public class WrongLoginException extends RuntimeException {
    private final String exception;

    public WrongLoginException() {
        exception = "������ ������ �� ������ ��������� 20 ��������.";
    }

    public String toString() {
        return "������� ����� �����: " + exception;
    }
}
