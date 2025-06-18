package com.example.myshiftapp_new;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuthentication {

    public static boolean verifyEmployee(String username, String password){

        DatabaseConnection database = new DatabaseConnection();
        Connection connect = database.getConnection();

        String verifyEmployee = "SELECT * FROM Employees WHERE username = ? AND password = ?";

        try{
            PreparedStatement statement = connect.prepareStatement(verifyEmployee);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            return result.next();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean verifyAdmin(String adminUsername, String adminPassword){

        DatabaseConnection database = new DatabaseConnection();
        Connection connect = database.getConnection();

        String verifyAdmin = "SELECT * FROM Admin WHERE adminUsername = ? AND adminPassword = ?";

        try{
            PreparedStatement statement = connect.prepareStatement(verifyAdmin);
            statement.setString(1, adminUsername);
            statement.setString(2, adminPassword);

            ResultSet result = statement.executeQuery();

            return result.next();
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
