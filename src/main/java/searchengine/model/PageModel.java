package searchengine.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "page")
public class PageModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id")
    private SiteModel site;

    @Column(columnDefinition = "TEXT")
    private String path;

    private int code;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;

}
