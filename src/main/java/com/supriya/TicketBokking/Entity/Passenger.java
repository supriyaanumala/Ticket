package com.supriya.TicketBokking.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Table(name="passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String start;
    private String destination;
    private String jDate;
    private String trainNum;

    public class TrainJourney {

        private Integer id;
        private String name;
        private String email;
        private String start;
        private String destination;
        private String jDate;
        private String trainNum;

        public TrainJourney(){

        }

        // Constructor
        public TrainJourney(Integer id, String name, String email, String start, String destination, String jDate, String trainNum) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.start = start;
            this.destination = destination;
            this.jDate = jDate;
            this.trainNum = trainNum;
        }

        // Getters and Setters
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getjDate() {
            return jDate;
        }

        public void setjDate(String jDate) {
            this.jDate = jDate;
        }

        public String getTrainNum() {
            return trainNum;
        }

        public void setTrainNum(String trainNum) {
            this.trainNum = trainNum;
        }
    }
}
