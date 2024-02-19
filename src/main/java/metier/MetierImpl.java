package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    //couplage faible
    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t+273.15;
        return res;
    }
    //Injecter dans la variable dao un objet d une classe qui implémente l'interface Dao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
