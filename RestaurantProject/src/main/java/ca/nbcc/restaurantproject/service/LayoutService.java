package ca.nbcc.restaurantproject.service;

import ca.nbcc.restaurantproject.model.Seating;
import ca.nbcc.restaurantproject.repo.SeatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayoutService {


    private LayoutRepo layoutRepo;

    public LayoutService(LayoutRepo layoutRepo) {
        this.layoutRepo = layoutRepo;
    }

    public List<Layout> getAllLayouts() {
        return layoutRepo.findAll();
    }

}
