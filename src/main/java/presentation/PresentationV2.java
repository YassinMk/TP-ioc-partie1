package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        ////Injection des dépendence par instanciation dynamique
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //DaoImpl = new DaoImpl();
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao  =(IDao) cDao.getConstructor().newInstance();

            //MetierImpl metier = new MetierImpl(d);
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            //metier.setDao(d); via le setter
            /*Method setDao =cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier,dao);
            */

            System.out.println("Res = " + metier.calcul());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
