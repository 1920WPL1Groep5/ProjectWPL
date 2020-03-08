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
    }
}
