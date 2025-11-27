package controllers;

import br.dev.borgesAirports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AirportService;

@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    
    @GetMapping("/airport")
    public List<Airport> findALL(){
        List<Airport> result = airportService.findALL();
        return result;
    }
    
    
}
