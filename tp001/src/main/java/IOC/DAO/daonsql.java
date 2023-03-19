package IOC.DAO;

public class daonsql implements  IDAO{
    public double getdata() {
        System.out.println("from no sql db");
        return (10);
    }
}
