package br.com.tracker.timeline.models.entity;

import java.util.UUID;

import br.com.tracker.timeline.models.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_TAG")
public class Tag extends BaseEntity {

    @Id
    @Column(name = "ID_TAG", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "ID_USUARIO", nullable = false)
    private UUID idUsuario;
}
