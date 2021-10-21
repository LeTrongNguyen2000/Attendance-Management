/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectSQL.MyConnection;
import Model.Checkin;
import Model.ClassSubject;
import Model.Student;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class UserDAO {

    Connection connection = MyConnection.getConnection();

    public boolean login(String UserName, String PassWord) {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT *"
                + "FROM [USER]"
                + "WHERE UserName = " + "'" + UserName + "'" + " AND " + "PassWord = " + PassWord;

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                if (UserName.equals(resultSet.getString(2)) && PassWord.equals(resultSet.getString(3))) {
                    return true;
                }
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void ChangePassword(String UserName, String PassWord) {
        String connectionUrl
                = "jdbc:sqlserver://"
                + "DESKTOP-AV93HC7;"
                + "database=QLSVJava;"
                + "user=adminsv;"
                + "password=29112000;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "UPDATE [USER]\n"
                    + "SET " + "PassWord = " + "'" + PassWord + "'"
                    + "WHERE UserName = " + "'" + UserName + "'" + "\n"
                    + "SELECT * FROM [USER]";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> ComparePassword(String UserName, String PassWord) {
        List<User> users = new ArrayList<User>();
        String connectionUrl
                = "jdbc:sqlserver://"
                + "DESKTOP-AV93HC7;"
                + "database=QLSVJava;"
                + "user=adminsv;"
                + "password=29112000;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT *\n"
                    + "FROM [USER]\n"
                    + "WHERE UserName = " + "'" + UserName + "'";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setPassWord(resultSet.getString("PassWord"));

                UserName = resultSet.getString(2);
                PassWord = resultSet.getString(3);

                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public List<User> findPassword(String UserName, String Password) {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT UserName, Password\n"
                + "FROM [USER]\n"
                + "WHERE UserName = " + "'" + UserName + "'";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setPassWord(resultSet.getString("Password"));

                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));

                Password = resultSet.getString(2);

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public List<User> setInfo(String UserName) {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT a.UserName, a.FullName, b.RoleName\n"
                + "FROM [USER] a, [ROLE] b\n"
                + "WHERE a.IdRole = b.IdRole and a.UserName = " + "'" + UserName + "'";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setFullName(resultSet.getString("FullName"));
                user.setRoleName(resultSet.getString("RoleName"));

                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT a.UserName, a.FullName, c.RoleName\n"
                + "FROM [USER] a, [STUDENT] b, [ROLE] c\n"
                + "WHERE a.IdUser = b.IdUser and a.IdRole = c.IdRole and c.IdRole = '3'";
        String sql1 = "SELECT a.UserName, a.FullName, c.RoleName\n"
                + "FROM [USER] a, [STUDENT] b, [ROLE] c\n"
                + "WHERE a.IdUser = b.IdUser and a.IdRole = c.IdRole and c.IdRole = '4'";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setFullName(resultSet.getString("FullName"));
                user.setRoleName(resultSet.getString("RoleName"));

                System.out.println("UserName:" + "\t" + resultSet.getString(1));
                System.out.println("FullName:" + "\t" + resultSet.getString(2));
                System.out.println("RoleName:" + "\t" + resultSet.getString(3));

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            PreparedStatement ps = connection.prepareStatement(sql1);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setFullName(resultSet.getString("FullName"));
                user.setRoleName(resultSet.getString("RoleName"));

                System.out.println("UserName:" + "\t" + resultSet.getString(1));
                System.out.println("FullName:" + "\t" + resultSet.getString(2));
                System.out.println("RoleName:" + "\t" + resultSet.getString(3));

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;

    }

    public void AddUser(User user) {
        String sql = "INSERT INTO User(FullName, UserName, PassWord, IdRole) VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassWord());
            preparedStatement.setString(4, user.getIdRole());

            int resultSet = preparedStatement.executeUpdate();
            System.out.println(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);  //////////// đoạn bắt lỗi này có thể sai
        }
    }

    public void UpdateUser(String UserName, String UserNameChange, String FullName, String PassWord, String IdRole) {
        String connectionUrl
                = "jdbc:sqlserver://"
                + "DESKTOP-AV93HC7;"
                + "database=QLSVJava;"
                + "user=adminsv;"
                + "password=29112000;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "UPDATE [USER]\n"
                    + "SET " + "FullName = " + "'" + FullName + "'" + ", " + "UserName = " + "'" + UserNameChange + "'" + ", " + "PassWord = " + "'" + PassWord + "'" + ", " + "IdRole = " + "'" + IdRole + "'"
                    + "WHERE UserName = " + "'" + UserName + "'" + "\n";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
            }
        } catch (SQLException e) {

        }
        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSQL = "SELECT * FROM [USER]";
            resultSet = statement.executeQuery(selectSQL);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteUser(String UserName) {
        String connectionUrl
                = "jdbc:sqlserver://"
                + "DESKTOP-AV93HC7;"
                + "database=QLSVJava;"
                + "user=adminsv;"
                + "password=29112000;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "alter table [STUDENT] nocheck constraint all\n"
                    + "delete from [USER] WHERE UserName = " + "'" + UserName + "'" + "\n"
                    + "alter table [STUDENT] check constraint all";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
        } catch (SQLException e) {

        }
    }

    public List<User> Search(String UserName) {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT UserName, FullName, b.RoleName\n"
                + "FROM [USER] a, [ROLE] b\n"
                + "WHERE a.IdRole = b.IdRole and UserName = " + "'" + UserName +"'";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setUserName(resultSet.getString("UserName"));
                user.setFullName(resultSet.getString("FullName"));
                user.setRoleName(resultSet.getString("RoleName"));

                System.out.println("UserName:" + "\t" + resultSet.getString(1));
                System.out.println("FullName:" + "\t" + resultSet.getString(2));
                System.out.println("RoleName:" + "\t" + resultSet.getString(3));

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return users;

    }

    public static void main(String[] args) {
        new UserDAO().Search("dinhngoc");
    }
}
