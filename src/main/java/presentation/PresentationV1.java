package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //Injection des dépendence par instanciation statique =>new
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d); // Injection via le constructeur
        //metier.setDao(d); via le setter
        System.out.println("Res = " + metier.calcul());
    }
}
