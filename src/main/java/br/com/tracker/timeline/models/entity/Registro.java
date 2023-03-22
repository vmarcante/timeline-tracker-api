package br.com.tracker.timeline.models.entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.tracker.timeline.models.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "TB_REGISTRO")
@Entity
public class Registro extends BaseEntity {

    @Id
    @Column(name = "ID_REGISTRO", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(name = "DATA_FINALIZACAO")
    private Date dataFinalizacao;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "ID_PROJETO")
    private UUID idProjeto;

    @Column(name = "ID_USUARIO", nullable = false)
    private UUID idUsuario;

    @OneToMany(mappedBy = "registro")
    @JsonIgnoreProperties({ "registro" })
    private List<RegistroTags> tags;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID_PROJETO", insertable = false, updatable = false)
    private Projeto projeto;
}
