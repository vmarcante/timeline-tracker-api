package br.com.tracker.timeline.models.entity;

import java.util.UUID;

import br.com.tracker.timeline.models.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends BaseEntity {

    @Id
    @Column(name = "ID_USUARIO", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "DOCUMENTO")
    private String documento;
}
