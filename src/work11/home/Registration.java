package work11.home;

public class Registration {
    static public boolean registerInSystem(String login, String password, String confirmPassword) {
        try {
            if (login.length() <20 && login.trim().indexOf(" ") == -1)
            {
                if (password.length() < 20 && password.indexOf(" ") == -1 && password.matches(".*\\d+.*")&&password.equals(confirmPassword))
                {System.out.println("Registration is successful");
                    return true;
                }
                else  throw new WrongPasswordException("Password length is more than 20 " +
                        "or contains spaces or is missing at least one digit or passwords or passwords don't match");

            }
              else  throw new WrongLoginException("Login length is more than 20 or contains spaces");

        } catch (WrongLoginException | WrongPasswordException e) {

            System.out.println(e.getMessage());
            return false;
        }
    }
}

