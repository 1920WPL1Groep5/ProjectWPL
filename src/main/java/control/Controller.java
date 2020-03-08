<<<<<<< Updated upstream
package Vraag1;

import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    public TextArea txtArrOrigin;
    public TextArea txtArrDeviatie;

    public void clickGeefGetallen(MouseEvent mouseEvent) {
        ArrayList<Integer> arrGetallen = new ArrayList<Integer>();
        final int iMaxAantal = 20;
        int iHuidigGetal, iTeller = 0, iSom = 0, iGemiddelde, iDeviatie;
        String sOrigineleArray = "";
        String sDeviatieArray = "";

        // start bij elke klik met blanco tekstvakken
        txtArrDeviatie.clear();
        txtArrOrigin.clear();

        try
        {
            // INPUT GETALLEN
            while(iTeller != iMaxAantal)
            {
                // ingave getal
                iHuidigGetal = Integer.parseInt(JOptionPane.showInputDialog("Geef een geheel positief getal"));

                if(iHuidigGetal >= 0)
                {
                    // opslag getal in array
                    arrGetallen.add(iHuidigGetal);
                    // toevoegen aan string voor output
                    sOrigineleArray += txtArrOrigin.getText() + iHuidigGetal + "\r\n";
                    // bijhouden som
                    iSom += iHuidigGetal;
                    // bijhouden teller
                    iTeller++;
                }

                if(iHuidigGetal == -1)
                {
                    break;
                }
            }

            // BEREKENING GEMIDDELDE
            iGemiddelde = Math.round(iSom / arrGetallen.size());

            // BEREKENING DEVIATIE
            for (int i = 0 ; i < arrGetallen.size() ; i++)
            {
                // deviatie(getal) = getal - gemiddelde
                iDeviatie = arrGetallen.get(i) - iGemiddelde;
                // toevoegen aan string voor output
                sDeviatieArray += txtArrDeviatie.getText() + iDeviatie + "\r\n";
            }

            // OUTPUT
            txtArrOrigin.setText(sOrigineleArray);
            txtArrDeviatie.setText(sDeviatieArray);
        }

        catch(NumberFormatException nfe)
        {   // FOUTMELDING indien geen geheel getal (vb string of kommagetal)
            txtArrOrigin.setText(
                    "Je hebt iets anders dan een geheel getal ingegeven." + "\r\n" +
                    "Voer je getallen opnieuw in.");
        }
=======
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
            for (Plant familielid : familieleden)
            {
                txtPlantenFamilie.setText(txtPlantenFamilie.getText() + familielid.getFgsv() + "\r\n");
            }
        } catch (SQLException e)
        {
            txtPlantenFamilie.setText(e.getMessage());
        }

>>>>>>> Stashed changes
    }
}
