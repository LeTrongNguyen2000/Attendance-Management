/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectSQL.MyConnection;
import Model.Checkin;
import Model.ClassSubject;
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
public class ClassSubjectDAO {

    Connection connection = MyConnection.getConnection();

    public List<ClassSubject> SetNumberOfClassSubject(String Quantity) {
        List<ClassSubject> classSubjects = new ArrayList<ClassSubject>();
        String selectSql = "SELECT COUNT(IdClassSubject) as Quantity\n"
                + "FROM [CLASS_SUBJECT]";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(selectSql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                ClassSubject classSubject = new ClassSubject();

                classSubject.setQuantity(resultSet.getString("Quantity"));

                Quantity = resultSet.getString(1);
                System.out.println(Quantity);

                classSubjects.add(classSubject);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return classSubjects;
    }
}
