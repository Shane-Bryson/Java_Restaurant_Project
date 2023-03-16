package ca.nbcc.restaurantproject.service;

import ca.nbcc.restaurantproject.model.Seating;
import ca.nbcc.restaurantproject.repo.SeatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {


    private TableRepo tableRepo;

    public TableService(TableRepo tableRepo) {
        this.tableRepo = tableRepo;
    }

    public List<Tables> getAllTables() {
        return tableRepo.findAll();
    }

    public Tables get(long id) {
        var entity = tableRepo.findById(id);
        if (entity.isPresent()) {
            return entity.get();
        }
        return null;
    }
}
