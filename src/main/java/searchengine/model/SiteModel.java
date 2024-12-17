package searchengine.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import searchengine.model.enumField.Status;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "site")
@Getter
@Setter
public class SiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "status_time",columnDefinition = "DATETIME ")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime statusTime;

    @Column(name = "last_error",columnDefinition = "TEXT")
    private String lastErrorText;

    @Column(columnDefinition = "VARCHAR(255)")
    private String url;

    @Column(columnDefinition = "VARCHAR(255)")
    private String name;

}
