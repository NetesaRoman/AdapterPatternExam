package view;

import api.ClientInterface;
import models.Adapter;

/*
 *
 * @author Roman Netesa
 *
 */
public class Main {
    public static void main(String[] args) {
        ClientInterface client = new Adapter("MyMessage");
        client.specificMethod();

    }
}