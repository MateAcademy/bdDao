package mate.academy;

import mate.academy.dao.FileClientDao;
import mate.academy.model.Client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileClientDao fileClientDao = new FileClientDao();
//        fileClientDao.save(new Client("Света", "+780567540700"));
        System.out.println(fileClientDao.get());

    }
}
