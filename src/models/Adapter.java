package models;

import api.ClientInterface;

/*
 *
 * @author Roman Netesa
 *
 * Adapter class that uses object of ServiceClass, so that it technically implements ClientInterface
 */
public class Adapter implements ClientInterface {

    private final ServiceClass service;

    public Adapter(String message){
        service = new ServiceClass(message);
    }

    @Override
    public void specificMethod() {
        service.doService();
    }
}
