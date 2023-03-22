package br.com.tracker.timeline.models.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.tracker.timeline.models.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PROJETO")
public class Projeto extends BaseEntity {

    @Id
    @Column(name = "ID_PROJETO", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "ID_CLIENTE")
    private UUID idCliente;

    @Column(name = "ID_USUARIO", nullable = false)
    private UUID idUsuario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", insertable = false, updatable = false)
    private Cliente cliente;
}
