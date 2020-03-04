package main.java;

import main.java.dao.Database;
<<<<<<< HEAD
import main.java.dao.Plant;
import main.java.utils.IoClass;
import main.java.utils.DateUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
=======
import main.java.model.Plant;

import java.sql.Connection;
import java.sql.SQLException;
>>>>>>> Bart_Branch

public class MainDao {

    private Connection dbConnection;

    public MainDao() throws SQLException {
        dbConnection = Database.getInstance().getConnection();
    }

    public static void main(String[] args) throws SQLException {
        MainDao main = new MainDao();
        main.daoDemo();
    }

    /**
     * Werken met de database via de DAO.
     * Deze methode vereist dat we de database Structuur kennen en over
     * model en dao classes beschikken.
     * @throws SQLException
     */
    private void daoDemo() throws SQLException {
        System.out.println("Dao Demo");
    }

    /** BEGIN HulpMethoden voor daoDemo **/
    /**
     * Print de lijst van de planten uit
     * @param titel
     * @param plant
     */
    public void showPlanten(String titel, Plant plant) {
        System.out.println("Lijst Planten : " + titel);
        System.out.println();
    }
}

