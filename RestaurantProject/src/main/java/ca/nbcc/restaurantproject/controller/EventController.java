package ca.nbcc.restaurantproject.controller;

import ca.nbcc.restaurantproject.model.Event;
import ca.nbcc.restaurantproject.model.Seating;
import ca.nbcc.restaurantproject.service.EventService;
import ca.nbcc.restaurantproject.service.SeatingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.List;

@Controller
public class EventController {


    private EventService eventService;
    private SeatingService seatingService;

    public EventController(EventService eventService, SeatingService seatingService) {
        this.eventService = eventService;
        this.seatingService = seatingService;
    }

    @GetMapping(value = {"/", "/home", "/seatings"})
    public String getAllSeatings(Model model) {
        var values = seatingService.getAllSeatings();
        model.addAttribute("seatings", values);

        return "index";
    }

    @GetMapping(value = "/seating/{id}")
    public String getSeating(Model model, @PathVariable long id) {
        Seating value = seatingService.get(id);
        model.addAttribute("seating", value);

        return "seating";
    }

    @GetMapping(value = "/create")
    public String create(Model model) {
        model.addAttribute("seating", new Seating());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String create(Seating seating) {

        seatingService.save(seating);

        return "redirect:/";
    }

    @GetMapping(value = "/deleteSeating/{id}")
    public String deleteSeating(@PathVariable(name = "id") long id) {
        Seating value = seatingService.get(id);
        seatingService.delete(value);

        return "redirect:/";
    }
// ------------------------ EVENTS ------------------------

    @ModelAttribute("events")
    public List<Event> getAllEvents() {
        var entities = eventService.findAllEvents();
        return entities;
    }

    @GetMapping(value = {"/events"})
    public String getAllEvents(Model model) {
        var values = eventService.findAllEvents();
        model.addAttribute("events", values);

        return "events";
    }

    @GetMapping(value = "/event/{id}")
    public String getEvent(Model model, @PathVariable long id) {
        Event value = eventService.get(id);
        model.addAttribute("event", value);

        return "eventDetails";
    }

    @GetMapping(value = "/createEvent")
    public String createEvent(Model model) {
        model.addAttribute("event", new Event());
        return "/createEvent";
    }

    @PostMapping(value = "/createEvent")
    public String createEvent(Event event) {

        eventService.save(event);

        return "redirect:/events";
    }

    @GetMapping(value = "/editEvent/{id}")
    public String editEvent(@PathVariable(name = "id") Model model) {
        model.addAttribute("event", new Event());

        return "redirect:/events";
    }

    @PostMapping(value = "/editEvent/{id}")
    public String editEvent(long id) {
        Event value = eventService.get(id);
        eventService.save(value);

        return "redirect:/events";
    }

    @GetMapping(value = "/deleteEvent/{id}")
    public String deleteEvent(@PathVariable(name = "id") long id) {
        Event value = eventService.get(id);
        eventService.delete(value);

        return "redirect:/events";
    }

}
