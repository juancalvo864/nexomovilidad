package com.nexomovilidad.nexomovilidad.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
public class Pasaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private LocalDateTime fecha;
    private int sillasCompradas;

    public Pasaje(long id, LocalDateTime fecha, int sillasCompradas) {
        this.id = id;
        this.fecha = fecha;
        this.sillasCompradas = sillasCompradas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getSillasCompradas() {
        return sillasCompradas;
    }

    public void setSillasCompradas(int sillasCompradas) {
        this.sillasCompradas = sillasCompradas;
    }
}
