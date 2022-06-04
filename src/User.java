import java.util.LinkedList;

public class User extends Account{
    private AccountType accountType;
    private String login;
    private String password;
    private LinkedList<Copy> myBooks;
    private LinkedList<Copy> reserveMyBooks;
    User(AccountType accountType, String login, String password){
        this.accountType=accountType;
        this.login=login;
        this.password=password;
        this.myBooks=new LinkedList<>();
        this.reserveMyBooks=new LinkedList<>();
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

    public LinkedList<Copy> getMyBooks(){
        return myBooks;
    }

    public void addBookToMyBooks(Copy copy){
        myBooks.add(copy);
    }

    public LinkedList<Copy> getReserveMyBooks(){
        return reserveMyBooks;
    }

    public void addBookToReserveMyBooks(Copy copy){
        reserveMyBooks.add(copy);
    }

}
