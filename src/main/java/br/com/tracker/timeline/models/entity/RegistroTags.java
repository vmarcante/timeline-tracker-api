package br.com.tracker.timeline.models.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TB_REGISTRO_TAGS")
@Data
public class RegistroTags {

    @Id
    @Column(name = "ID_REGISTRO_TAGS", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ID_REGISTRO", nullable = false)
    @JsonIgnoreProperties({ "tags" })
    private Registro registro;

    @ManyToOne
    @JoinColumn(name = "ID_TAG", nullable = false)
    private Tag tag;
}
