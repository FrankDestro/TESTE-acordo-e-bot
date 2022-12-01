package com.devsuperior.dssales.repositories;

import com.devsuperior.dssales.dto.AcordoSummaryDTO;
import com.devsuperior.dssales.entities.Bot;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssales.entities.Acordo;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface AcordoRepository extends JpaRepository<Acordo, Long> {

     @Query("SELECT new com.devsuperior.dssales.dto.AcordoSummaryDTO(SUM(obj.total), COUNT(obj.id)) "
            + "FROM Acordo AS obj "
            + "WHERE (CAST(:min AS date) IS NULL OR obj.date >= :min) "
            + "AND (CAST(:max AS date) IS NULL OR obj.date <= :max) ")
    AcordoSummaryDTO AcordoSummary(LocalDate min, LocalDate max);


}
