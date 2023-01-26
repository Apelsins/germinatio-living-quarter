package vela.gliese1132b.germinatio.living.quarter.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "living_compartments")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LivingCompartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "living_compartment_id")
    @Nullable
    private Long id;

    @Column(name = "living_compartment_number")
    @Nonnull
    private String number;

    @Column(name = "living_compartment_alias")
    @Nullable
    private String alias;

    @Column(name = "living_compartment_capacity")
    @Nonnull
    private String capacity;

}
