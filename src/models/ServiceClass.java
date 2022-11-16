package models;

/*
 *
 * @author Roman Netesa
 *
 * This class should implement interface, but it can't be changed, so we are using Adapter pattern.
 */
public class ServiceClass {
    private final String message;

    public ServiceClass(String message){
        this.message = message;
    }

    public void doService(){
        System.out.println(message);
    }
}
