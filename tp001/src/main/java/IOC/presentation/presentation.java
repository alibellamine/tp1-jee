package IOC.presentation;

import IOC.DAO.daonsql;
import IOC.DAO.daonsql;
import IOC.metier.metierimpl;

public class presentation {
    public static void main(String[] args) {
       // metierimpl metier =new metierimpl();
      //  daoimpl sql = new daoimpl();
        metierimpl metier=new metierimpl();
        daonsql nosql = new daonsql();
       // metier.setDao(sql);
        metier.setDao(nosql);
        double resultat = metier.calcul();
        System.out.println("resultat est:"+resultat);
    }
}
