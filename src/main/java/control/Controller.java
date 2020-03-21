package main.java.control;

// dao's en model class
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
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
    public ComboBox cmbType;
    public TextField txtFamilie;
    public TextField txtGeslacht;
    public TextField txtSoort;
    public TextField txtCultivar;
    public Spinner SpinnerBlad;
    public Spinner SpinnerBloei;

    public TextArea txtResultaat;

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
            txtResultaat.clear();
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
                    txtResultaat.setText(txtResultaat.getText() + familielid.getFgsv() + "\r\n");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Geen planten voor deze familie gevonden");
            }
        } catch (SQLException e)
        {
            txtResultaat.setText(e.getMessage());
        }
    }

    public void clicked_Zoeken(MouseEvent mouseEvent){
        try{
            // dao aanmaken met huidige dbConnectie
            PlantDao plantDao = new PlantDao(dbConnection);
            // eigenschap om op te zoeken en zoekterm voor deze eigenschap
            String sEigenschap = "", sZoekterm = "";

            //        TODO : foutafhandeling: geen enkele van de vier txtFields ingevuld
                if (!txtFamilie.getText().equals("")) {
                    sEigenschap = "familie";
                    sZoekterm = txtFamilie.getText();
                }
                else if (!txtGeslacht.getText().equals("")) {
                    sEigenschap = "geslacht";
                    sZoekterm = txtGeslacht.getText();
                }
                else if (!txtSoort.getText().equals("")) {
                    sEigenschap = "soort";
                    sZoekterm = txtSoort.getText();
                }
                else if (!txtCultivar.getText().equals("")) {
                    sEigenschap = "variatie"; // benaming cultivar in database
                    sZoekterm = txtCultivar.getText();
                }

                txtResultaat.clear();

            List<Plant> plantList = plantDao.getPlantByStringProperty(sEigenschap,sZoekterm);
            
            if(!plantList.isEmpty()){
                for (Plant plant : plantList)
                {
                    txtResultaat.setText(txtResultaat.getText() + plant.getFgsv() + "\r\n");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Geen planten voor deze eigenschap gevonden");
            }
        }
        catch (SQLException e) {
            txtResultaat.setText(e.getMessage());
        }
    }
}
