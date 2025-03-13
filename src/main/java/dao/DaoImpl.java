package dao;

import org.springframework.stereotype.Component;

@Component("dao")

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Getting data from the database...");
        double temp = 23;
        return temp;
    }
}
