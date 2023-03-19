package IOC.metier;

import IOC.DAO.IDAO;

public class metierimpl implements  IMETIER{
    IDAO dao;

    public double calcul(){
        double data = dao.getdata();
        return data*10;
    }

    public void setDao(IDAO dao){
        this.dao=dao;
    }
}
