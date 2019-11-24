package mate.academy.dao;

import mate.academy.di.Component;
import mate.academy.model.Client;

import java.io.*;

@Component
public class FileClientDao implements ClientDao{

    public void save(Client client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("storage.dat"))){
            objectOutputStream.writeObject(client);
        } catch (Exception e) {
            System.out.println("Не удалось записать клиента в базу");
        }

    }

    //можно научиться брать по имени
    public Client get() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            return  (Client) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Клиент не найден в системе");
            return null;
        }
    }
}
