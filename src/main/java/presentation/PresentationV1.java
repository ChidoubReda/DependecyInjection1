package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //Couplage fort
        DaoImpl d = new DaoImpl();
        //DaoImplV2 d = new DaoImplV2(); //Par instanciation statique
        MetierImpl metier = new MetierImpl(d); //Injection de dépendance via le constructeur
        //metier.setDao(d); //Injection de dépendance via le setter
        System.out.println("Result = "+metier.calcul());
    }
}
