package main.java.dao;

import main.java.model.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
// Vancoillie Matthias
public class TypeDao {

    private static final String GETALLTYPES =
            "SELECT * FROM plant";
    private static final String GETTYPEBYID =
            "SELECT * FROM plant WHERE type_id = ?";
    private static final String GETTYPEBYNAAM =
            "SELECT * FROM fgsv";

    private Connection dbConnection;

    private PreparedStatement stmtSelectTypeById;
    private PreparedStatement stmtSelectTypeByNaam;

    public TypeDao(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectTypeById = dbConnection.prepareStatement(GETTYPEBYID);
        stmtSelectTypeByNaam = dbConnection.prepareStatement(GETTYPEBYNAAM);
    }

    public List<Type> getAllTypes() {
        List<Type> typeList =  new ArrayList<>();
        try {
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(GETALLTYPES);
            while (rs.next()) {
                Type type =
                        new Type(
                                rs.getInt("type_id"),
                                rs.getString("type_naam")
                        );
             typeList.add(type);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TypeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return typeList;
    }

    public Type GetTypeById(Integer type_id) throws SQLException {
        Type typen = null;
        stmtSelectTypeById.setInt(1,type_id);
        ResultSet rs = stmtSelectTypeById.executeQuery();
        if (rs.next()) {
            typen = new Type(
                    rs.getInt("type_id")
            );
        }
        return typen;
    }

}
