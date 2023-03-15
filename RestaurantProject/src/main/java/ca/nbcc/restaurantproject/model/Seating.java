package ca.nbcc.restaurantproject.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
public class Seating {

    @Id
    @Column(name = "SeatingId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EventId", foreignKey = @ForeignKey(name="FK_Event_Seating"))
    private Event event;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime startdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime enddate;

    public Seating() {
    }

    public Seating(Event event, LocalDateTime startdate, LocalDateTime enddate) {
        this.event = event;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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
        return "Seating{" +
                "id=" + id +
                ", event=" + event +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
