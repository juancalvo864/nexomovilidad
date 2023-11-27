package com.nexomovilidad.nexomovilidad.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private TipoDeCambio tipoDeCambio;
    private String descripcion;

    private LocalDateTime fechaAlta;

    public Logs(long id, TipoDeCambio tipoDeCambio, String descripcion, LocalDateTime fechaAlta) {
        this.id = id;
        this.tipoDeCambio = tipoDeCambio;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoDeCambio getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(TipoDeCambio tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
