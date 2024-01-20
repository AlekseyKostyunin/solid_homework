public class Persister implements Persisterable{
//    private final User user;
    private final IUser iuser;

    public Persister(IUser iuser){
        this.iuser = iuser;
    }

    public void save(IUser iuser){
        System.out.println("Save user: " + iuser.getName());
    }
}
