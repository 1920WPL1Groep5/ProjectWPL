package main.java.control;

// dao's en model class
import main.java.dao.Database;
import main.java.dao.PlantDao;
import main.java.model.Plant;
// sql classes
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
// javafx classes
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class Controller {
    public TextField txtFamilie;
    public TextArea txtPlantenFamilie;

    private Connection dbConnection;

    // opstellen databaseconnectie
    public void initialize() throws SQLException{
        dbConnection = Database.getInstance().getConnection();
    }

    public void showPlanten(String titel, Plant plant) {
        System.out.println("Lijst Planten : " + titel);
        System.out.println();
    }

    // Jasper: aanmaak
    public void zoekFamilie(MouseEvent mouseEvent){
        try{
            txtPlantenFamilie.clear();
            // input GUI: gedeelte van naam familie is voldoende
            String familie = txtFamilie.getText();
            // dao aanmaken met huidige dbConnectie
            PlantDao plantDao = new PlantDao(dbConnection);
            // plantenlijst aanmaken en vullen met gevonden planten voor gezochte familie
            List<Plant> familieleden = plantDao.getPlantByFamilie(familie);
            // van elk familielid de wetenschappelijke naam tonen in textArea
            if(!familieleden.isEmpty()){
                for (Plant familielid : familieleden)
                {
                    txtPlantenFamilie.setText(txtPlantenFamilie.getText() + familielid.getFgsv() + "\r\n");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Geen planten voor deze familie gevonden");
            }
        } catch (SQLException e)
        {
            txtPlantenFamilie.setText(e.getMessage());
        }
    }
}
