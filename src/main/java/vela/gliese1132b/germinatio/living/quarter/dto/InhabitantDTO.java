package vela.gliese1132b.germinatio.living.quarter.dto;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public class InhabitantDTO {

    @Nullable
    private Long id;

    @Nonnull
    private String name;

    @Nullable
    private Set<LivingCompartmentDTO> livingCompartments;
}
