package dam;

public class Controller {
    private Service service;
    public void doPost(){

        service.test();
    }
    public void setService(Service service) {
        this.service = service;
    }

}
