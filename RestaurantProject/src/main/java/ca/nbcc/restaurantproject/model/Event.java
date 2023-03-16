package ca.nbcc.restaurantproject.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {

    @Id
    @Column(name = "EventId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String eventname;

    private String description;

    private double price;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime startdate;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime enddate;

//    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    @JoinColumn(name = "SeatingId", foreignKey = @ForeignKey(name="FK_Seating_Event"))
//    private List<Seating> seating;

    public Event() {
    }

    public Event(String eventname, String description, double price, LocalDateTime startdate, LocalDateTime enddate) {
        this.eventname = eventname;
        this.description = description;
        this.price = price;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventname='" + eventname + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
