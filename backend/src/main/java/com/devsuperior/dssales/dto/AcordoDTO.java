package com.devsuperior.dssales.dto;

import com.devsuperior.dssales.entities.Acordo;
import com.devsuperior.dssales.entities.Bot;

import java.time.LocalDate;

public class AcordoDTO {

    private Long id;
    private LocalDate date;
    private Integer volume;
    private Double total;

    private Bot bot;

    public AcordoDTO() {
    }

    public AcordoDTO(Long id, LocalDate date, Integer volume, Double total, Bot bot) {
        this.id = id;
        this.date = date;
        this.volume = volume;
        this.total = total;
        this.bot = bot;
    }

    public AcordoDTO(Acordo entity) {
        id = entity.getId();
        date = entity.getDate();
        volume = entity.getVolume();
        total = entity.getTotal();
        bot = entity.getBot();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }
}
