package dam;

public class Service {
    private Dao dao;

    public void test(){
        System.out.println("service working");
          dao.TestDao();
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }



}
