package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
    @Autowired
    //Couplage faible
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public double calcul() {
        double t = dao.getData();
        double result = t * 23;
        return result;
    }
}
