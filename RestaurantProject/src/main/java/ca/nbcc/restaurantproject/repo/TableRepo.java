package ca.nbcc.restaurantproject.repo;

import ca.nbcc.restaurantproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TableRepo extends JpaRepository<Table, Long> {

}