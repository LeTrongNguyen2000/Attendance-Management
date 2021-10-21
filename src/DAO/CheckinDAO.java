/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectSQL.MyConnection;
import Model.Checkin;
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
public class CheckinDAO {
    Connection connection = MyConnection.getConnection();

    public List<Checkin> SetNumberOfCheckin(String Quantity) {
        List<Checkin> checkins = new ArrayList<Checkin>();
        String selectSql = "SELECT COUNT(IdCheckin) as Quantity\n"
                + "FROM [CHECKIN]";

        ResultSet resultSet = null;

        try {
            PreparedStatement ps = connection.prepareStatement(selectSql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Checkin checkin = new Checkin();

                checkin.setQuantity(resultSet.getString("Quantity"));

                Quantity = resultSet.getString(1);
                System.out.println(Quantity);

                checkins.add(checkin);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return checkins;
    }
}
