/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectSQL.MyConnection;
import Model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class StudentDAO {

    Connection connection = MyConnection.getConnection();

    public List<Student> SetNumberOfStudent(String Quantity) {
        List<Student> students = new ArrayList<Student>();
        String selectSql = "SELECT COUNT(StudentCode) as Quantity\n"
                + "FROM [STUDENT]";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(selectSql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();

                student.setQuantity(resultSet.getString("Quantity"));

                Quantity = resultSet.getString(1);
                System.out.println(Quantity);

                students.add(student);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public List<Student> SetNumberOfLeader(String Quantity) {
        List<Student> students = new ArrayList<Student>();
        String selectSql = "SELECT COUNT(StudentCode) as Quantity\n"
                + "FROM [STUDENT] a, [USER] b\n"
                + "WHERE a.IdUser = b.IdUser and b.IdRole = '2'";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(selectSql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();

                student.setQuantity(resultSet.getString("Quantity"));

                Quantity = resultSet.getString(1);
                System.out.println(Quantity);

                students.add(student);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return students;
    }


    public static void main(String[] args) {
        new StudentDAO().SetNumberOfLeader("");
    }
}
