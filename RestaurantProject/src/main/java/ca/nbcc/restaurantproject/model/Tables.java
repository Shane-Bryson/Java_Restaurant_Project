package ca.nbcc.model;

import ch.qos.logback.core.Layout;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Tables {

    @Entity
    public class Table {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long tableId;

        //private Layout layout;

        private int seats;

        public Long getTableId() {
            return tableId;
        }

        public void setTableId(Long tableId) {
            this.tableId = tableId;
        }

        public Layout getLayout() {
            return null;
        }

        public void setLayout(Layout layout) {
            //
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }
    }
}
