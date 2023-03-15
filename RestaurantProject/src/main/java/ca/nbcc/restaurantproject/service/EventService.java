package ca.nbcc.restaurantproject.service;

//import ca.nbcc.restaurantproject.exceptions.EventNotFoundException;
import ca.nbcc.restaurantproject.model.Event;
import ca.nbcc.restaurantproject.model.Seating;
import ca.nbcc.restaurantproject.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepo eventRepo;

    public List<Event> findAllEvents() {
        return eventRepo.findAll();
    }

    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public void save(Event event) {
        eventRepo.save(event);
    }

    public void delete(Event event) {
        eventRepo.delete(event);
    }

    public Event get(long id) {
        var entity = eventRepo.findById(id);
        if (entity.isPresent()) {
            return entity.get();
        }
        return null;
    }


//    public Event findAllByEventname(String eventName) throws EventNotFoundException {
//        Optional<Event> event = eventRepo.findAllByEname(eventName);
//
//        if (event.isPresent()) {
//            return event.get();
//        } else {
//            throw new EventNotFoundException(eventName);
//        }
//    }

}
