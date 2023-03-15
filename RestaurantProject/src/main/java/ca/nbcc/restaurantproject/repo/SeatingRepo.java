package ca.nbcc.restaurantproject.repo;

import ca.nbcc.restaurantproject.model.Seating;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatingRepo extends JpaRepository<Seating, Long> {

}