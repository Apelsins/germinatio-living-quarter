package vela.gliese1132b.germinatio.living.quarter.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "inhabitants")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inhabitant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inhabitant_id")
    @Nullable
    private Long id;

    @Column(name = "inhabitant_name")
    @Nonnull
    private String name;

    @Nullable
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "xref_inhabitant_2_living_compartment",
            joinColumns = { @JoinColumn(name = "inhabitant_id") },
            inverseJoinColumns = { @JoinColumn(name = "living_compartment_id") }
    )
    private Set<LivingCompartment> livingCompartments = new HashSet<>();
}
