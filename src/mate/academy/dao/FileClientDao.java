package mate.academy.dao;

import mate.academy.model.Client;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClientDao implements ClientDao{

    public void save(Client client) {
//        Path path = Paths.get("storage.dat");
//        Files.createFile(path);
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
