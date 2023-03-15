package ca.nbcc.restaurantproject.repo;

import ca.nbcc.restaurantproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepo extends JpaRepository<Event, Long> {

//    Optional<Event> findAllByEname(String eventName);
}
