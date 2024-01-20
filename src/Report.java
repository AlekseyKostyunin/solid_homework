public class Report implements Reportable{

    private final IUser iuser;

    public Report(IUser iuser) {
        this.iuser = iuser;
    }

    @Override
    public void report(IUser iuser) {
        System.out.println("Report for user: " + iuser.getName());
    }
}
