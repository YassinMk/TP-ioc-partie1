package dao;

public class DaoImpl implements IDao
{
    @Override
    public double getData() {
        System.out.println("Version  base de donnée ");
        double tmp= 12;
        return tmp;
    }
}
