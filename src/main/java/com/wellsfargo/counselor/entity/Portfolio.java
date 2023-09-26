package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column
    @OneToOne
    private Client clientId;

    @Column(nullable = false)
    private String creationDate;


    protected Portfolio() {

    }

    public Portfolio(Client clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
