package ru.skypro;


public class Main<logLength> {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

       try {
           CheckingLogPas("Gabriel_", "qwerty_1", "qwerty_");
       }catch (WrongLoginException e) {
           System.out.println(e);

       } catch (WrongPasswordException e) {
           System.out.println(e);

       } finally {
           System.out.println("Проверка завершена.");
       }
    }

    public static boolean CheckingLogPas(String login, String password, String confirmPassword)
             throws WrongLoginException, WrongPasswordException {

        boolean flag = false;

        if (login.matches("[a-zA-Z0-9_]+$")) {
            flag = true;
        }

        if (login.length() > 20) {
           flag = false;
            throw new WrongLoginException();
        }

        if (password.matches("[a-zA-Z0-9_]+$")) {
            flag = true;
        } else {
            return flag;
        }

        if (password.length() >= 20) {
            flag = false;
        }

        if (password.equals(confirmPassword)) {
            flag = true;
        } else {
            throw new WrongPasswordException();
        }

        return flag;
    }

}
