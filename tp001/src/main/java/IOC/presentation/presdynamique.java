package IOC.presentation;
import java.io.File;
import java.lang.reflect.Method;

import java.util.Scanner;
import IOC.DAO.IDAO;
import IOC.metier.IMETIER;
public class presdynamique {
    public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(new File("src/config.txt"));

        String dao = sc.nextLine();

        Class clsDao = Class.forName(dao);

        IDAO objDao = (IDAO) clsDao.newInstance();

        String metier = sc.nextLine();
        Class clsMetier = Class.forName(metier);
        IMETIER objMetier = (IMETIER)clsMetier.newInstance();

        Method method = clsMetier.getMethod("setDAO", IDAO.class);
        method.invoke(objMetier,objDao);
        System.out.println(objMetier.calcul());
    }
}
