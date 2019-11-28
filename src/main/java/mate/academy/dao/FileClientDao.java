package main.java.mate.academy.dao;

import main.java.mate.academy.di.Component;
import main.java.mate.academy.model.Client;

import java.io.*;

/**
 * Это первый вариант хранения, серриализация, для этого серриализуемый обьект должен
 * имплементить сериалайзабл
 */
@Component
public class FileClientDao implements ClientDao{

    public void save(Client client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("storage.dat"))){
            objectOutputStream.writeObject(client);
        } catch (Exception e) {
            System.out.println("Не удалось записать клиента в базу");
        }

    }

//TODO:    можно научиться брать по имени
    public Client get() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            return  (Client) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Клиент не найден в системе");
            return null;
        }
    }
}
