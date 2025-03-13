package metier;

import dao.IDao;

public class MetierImpl {
    //Couplage faible
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public double calcul() {
        double t = dao.getData();
        double result = t * 23;
        return result;
    }
}
