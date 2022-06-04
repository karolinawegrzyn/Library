public class Admin extends Account{
    private AccountType accountType;
    private String login;
    private String password;
    Admin(AccountType accountType, String login, String password){
        this.accountType=accountType;
        this.login=login;
        this.password=password;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
