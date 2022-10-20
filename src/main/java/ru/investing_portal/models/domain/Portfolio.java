package ru.investing_portal.models.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="portfolio")
public class Portfolio {

    /**
     * Идентификатор портфолио
     */
    @Id
    @SequenceGenerator(name="portfolio_sequence", sequenceName = "portfolio_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="portfolio_sequence")
    @Column(name="id")
    private int id;

    /**
     * Название портфолио
     */
    @Column(name="name")
    private String name;

    /**
     * Комментарии к портфолио
     */
    @Column(name="comments")
    private String comments;

}
