package service;

import br.dev.borgesAirports.entities.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AirportRepository;

@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportsRepository;
    public List<Airport> findALL() {
        List<Airport> result = airportsRepository.findAll();
        return result;
        
    }
    
}
