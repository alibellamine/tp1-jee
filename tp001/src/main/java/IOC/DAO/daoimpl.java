package IOC.DAO;

public class daoimpl  implements IDAO{
    public double getdata(){
        System.out.println("from sql db");
        return(7);
    }
}
