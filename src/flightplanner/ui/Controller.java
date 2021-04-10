package flightplanner.ui;

import flightplanner.controllers.FlightSearchController;
import flightplanner.data.FlDataConnection;
import flightplanner.entities.Airport;

import java.util.ArrayList;

public class Controller {
    FlightSearchController searchController;
    FlDataConnection connection;
    public Controller(){
        connection = new FlDataConnection();
        searchController = FlightSearchController.getInstance();
        searchController.setConnection(connection);
    }

    public ArrayList<Airport> getAirports(){
        ArrayList<Airport> airports = null;
        try {
            airports = searchController.searchAirports();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return airports;
    }
}
