package database.dao;

import database.model.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Kyra on 15/04/2016.
 */
public class DAOTester {
      private void userTest() {
        UserDAO obj = new UserDAO();
        String userName = "Bob";
        obj.createUser(userName, "passwordpasswordpassword");
        User user = obj.getUser(userName);
        if (user!=null) {
            System.out.println(obj.correctPassword(userName, "passwordpasswordpassword"));
        } else {
            System.out.println("no user");
        }
    }

    private void bookTest() {

    }

    public static void main(String[] args) {
        DAOTester obj = new DAOTester();
//        obj.userTest();
        obj.bookTest();
    }
}
