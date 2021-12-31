package i.phone.java_jsp_servlet.model;

import i.phone.java_jsp_servlet.entity.Phone;
import i.phone.java_jsp_servlet.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhoneModel {

    public ArrayList<Phone> findAll() {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from phones");
                ResultSet resultSet = preparedStatement.executeQuery();
                while(res){

                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>();
    }

    public Phone findById(int id) {
        return null;
    }

    public boolean save(Phone phone) {
        return false;
    }

    public boolean update(int id,Phone phone) {
        return false;
    }

    public boolean delete(int id){
        return false;
    }
}
