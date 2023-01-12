package vela.gliese1132b.germinatio.living.quarter.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "inhabitants")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inhabitant {

    @Id
    @Column(name = "inhabitant_id")
    @Nullable
    private Long id;

    @Column(name = "inhabitant_name")
    @Nonnull
    private String name;
}
