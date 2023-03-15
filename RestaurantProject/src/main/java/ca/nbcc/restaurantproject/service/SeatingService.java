package ca.nbcc.restaurantproject.service;

import ca.nbcc.restaurantproject.model.Seating;
import ca.nbcc.restaurantproject.repo.SeatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingService {


    private SeatingRepo seatingRepo;

    public SeatingService(SeatingRepo seatingRepo) {
        this.seatingRepo = seatingRepo;
    }


    public List<Seating> getAllSeatings() {
        return seatingRepo.findAll();
    }

    public void save(Seating seating) {
        seatingRepo.save(seating);
    }

    public void delete(Seating seating) {
        seatingRepo.delete(seating);
    }

    public Seating get(long id) {
        var entity = seatingRepo.findById(id);
        if (entity.isPresent()) {
            return entity.get();
        }
        return null;
    }
}
