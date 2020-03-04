package main.java.dao;

import main.java.model.Plant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Maes Bart (lijn 10 tot 71)
public class PlantDao {
    private static final String GETALLPLANTEN =
            "SELECT * FROM plant";
    private static final String GETPLANTBYID =
            "SELECT * FROM student WHERE plant_id = ?";
    private static final String GETPLANTBYTYPE =
            "SELECT * FROM plant WHERE type LIKE ?";


    private Connection dbConnection;

    private PreparedStatement stmtSelectPlantById;
    private PreparedStatement stmtSelectPlantByType ;

    public PlantDao(Connection dbConnection) throws SQLException {   // PlantDao is niet actief ?
        this.dbConnection = dbConnection;
        stmtSelectPlantById = dbConnection.prepareStatement(GETPLANTBYID);
        stmtSelectPlantByType = dbConnection.prepareStatement(GETPLANTBYTYPE);
    }

    public List<Plant> getAllPlanten() {
        List<Plant> plantList = new ArrayList<>();
        try {
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(GETALLPLANTEN);
            while (rs.next()) {
                Plant plant =
                        new Plant(
                                rs.getInt("plant_id"),
                                rs.getString("type"),
                                rs.getString("familie"),
                                rs.getString("geslacht"),
                                rs.getString("soort"),
                                rs.getString("variatie"),
                                rs.getInt("plantdichtheid_min"),
                                rs.getInt("plantdichtheid_max"),
                                rs.getString("fgsv")
                        );
                plantList.add(plant);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plantList;
    }

    public Plant GetPlantById(Integer plant_id) throws SQLException {
        Plant planten = null;
        stmtSelectPlantById.setInt(1, plant_id);
        ResultSet rs = stmtSelectPlantById.executeQuery();
        if (rs.next()) {
            planten = new Plant(
                    rs.getInt("plant_id"),
                    rs.getString("type"),
                    rs.getString("familie"),
                    rs.getString("geslacht"),
                    rs.getString("soort"),
                    rs.getString("variatie"),
                    rs.getInt("plantdichtheid_min"),
                    rs.getInt("plantdichtheid_max"),
                    rs.getString("fgsv")
            );
        }
        return planten;
    }
    public List<Plant> GetStudentByType(String type) throws SQLException {
        List<Plant> studentList = new ArrayList<>();

        stmtSelectPlantByType.setString(1, "%" + naamStudent + "%");
        ResultSet rs = stmtSelectByName.executeQuery();

        try {
            while (rs.next()) {
                Student student =
                        new Student(rs.getInt("idStudent"),
                                rs.getString("Naam"),
                                rs.getDate("GeboorteDatum"));
                studentList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return studentList;
    }


}
