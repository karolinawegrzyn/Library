public class Copy extends Book{
    private int id;
    private CopyStatus status;
    Copy(Author author, String title, int ISBN, int id, CopyStatus status){
        super(title, ISBN, author);
        this.id=id;
        this.status=status;
    }

    public void setStatus(CopyStatus status){
        this.status=status;
    }

    public CopyStatus getStatus(){
        return status;
    }

    public int getId(){
        return id;
    }
}
