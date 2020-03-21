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
    // Jasper: ophalen plant op basis van familie
    private static final String GETPLANTBYFAMILIE =
            "SELECT * FROM plant WHERE familie LIKE ?";
    // Jasper: Ophalen plant op basis van String Eigenschap
    private static final String GETPLANTBYSTRINGPROPERTY =
            "SELECT * FROM plant WHERE ? LIKE ?";

    private Connection dbConnection;

    private PreparedStatement stmtSelectPlantById;
    private PreparedStatement stmtSelectPlantByType;
    private PreparedStatement stmtSelectPlantByFamilie;
    private PreparedStatement stmtSelectPlantByStringProperty;

    public PlantDao(Connection dbConnection) throws SQLException {
        this.dbConnection = dbConnection;
        stmtSelectPlantById = dbConnection.prepareStatement(GETPLANTBYID);
        stmtSelectPlantByType = dbConnection.prepareStatement(GETPLANTBYTYPE);
        stmtSelectPlantByFamilie = dbConnection.prepareStatement(GETPLANTBYFAMILIE);
        stmtSelectPlantByStringProperty = dbConnection.prepareStatement(GETPLANTBYSTRINGPROPERTY);
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

    public Plant getPlantById(Integer plant_id) throws SQLException {
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

    public List<Plant> getPlantByType(String type) throws SQLException {
        List<Plant> PlantList = new ArrayList<>();

        stmtSelectPlantByType.setString(1, "%" + type + "%");
        ResultSet rs = stmtSelectPlantByType.executeQuery();

        try {
            while (rs.next()) {
                Plant planten =
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
                PlantList.add(planten);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PlantList;
    }
    // getPlantByFamily : Jasper
    public List<Plant> getPlantByFamilie(String type) throws SQLException {
        List<Plant> PlantList = new ArrayList<>();

        stmtSelectPlantByFamilie.setString(1, "%" + type + "%");
        ResultSet rs = stmtSelectPlantByFamilie.executeQuery();

            while (rs.next()) {
                Plant planten =
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
                PlantList.add(planten);
            }
        return PlantList;
    }

    public List<Plant> getPlantByStringProperty(String sProperty, String sSearch) throws SQLException {
        List<Plant> PlantList = new ArrayList<>();

        stmtSelectPlantByStringProperty.setString(1, sProperty);
        stmtSelectPlantByStringProperty.setString(2, "%" + sSearch + "%");
        ResultSet rs = stmtSelectPlantByStringProperty.executeQuery();

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
            PlantList.add(plant);
        }
        return PlantList;
    }
}
