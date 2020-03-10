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
    public TextField txtGeslacht;
    public TextArea txtPlantenGeslacht;

    private Connection dbConnection;

    // opstellen databaseconnectie
    public void initialize() throws SQLException{
        dbConnection = Database.getInstance().getConnection();
    }

    public void showPlanten(String titel, Plant plant) {
        System.out.println("Lijst Planten : " + titel);
        System.out.println();
    }

    // Kristina geslacht
    public void zoekGeslacht(MouseEvent mouseEvent){
        try{
            txtPlantenGeslacht.clear();
            // input GUI: geslacht of gedeelte geslacht intypen
            String geslacht = txtGeslacht.getText();

            // dao aanmaken met huidige dbConnectie
            PlantDao plantDao = new PlantDao(dbConnection);

            // plantenlijst aanmaken en vullen met gevonden planten voor gezochte geslacht
            List<Plant> geslachten = plantDao.getPlantByGeslacht(geslacht);

            // van elk geslacht de planten aantonen
            for (Plant geslachtX : geslachten)
            {
                txtPlantenGeslacht.setText(txtPlantenGeslacht.getText() + geslachtX.getFgsv() + "\r\n");
            }
        } catch (SQLException e)
        {
            txtPlantenGeslacht.setText(e.getMessage());
        }
    }
}



// controller fenotype

/* package main.java.control;

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
    public TextField txtFenotype;
    public TextArea txtPlantenFenotype;

    private Connection dbConnection;

    // opstellen databaseconnectie
    public void initialize() throws SQLException{
        dbConnection = Database.getInstance().getConnection();
    }

    public void showPlanten(String titel, Plant plant) {
        System.out.println("Lijst Planten : " + titel);
        System.out.println();
    }

    // Kristina fenotype
    public void zoekFenotype(MouseEvent mouseEvent){
        try{
            txtPlantenFenotype.clear();
            // input GUI: fenotype of gedeelte fenotype intypen
            String fenotype = txtFenotype.getText();

            // dao aanmaken met huidige dbConnectie
            PlantDao plantDao = new PlantDao(dbConnection);

            // plantenlijst aanmaken en vullen met gevonden planten voor gezochte fenotype
            List<Plant> fenotypes = plantDao.getPlantByFenotype(fenotype);

            // van elk fenotypeX de fenotype aantonen
            for (Plant fenotypeX : fenotypes)
            {
                txtPlantenFenotype.setText(txtPlantenFenotype.getText() + fenotypeX.getFgsv() + "\r\n");
            }
        } catch (SQLException e)
        {
            txtPlantenFenotype.setText(e.getMessage());
        }
    }
}

 */
