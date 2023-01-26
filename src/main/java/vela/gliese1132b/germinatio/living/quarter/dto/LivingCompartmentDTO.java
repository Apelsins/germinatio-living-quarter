package vela.gliese1132b.germinatio.living.quarter.dto;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LivingCompartmentDTO {

    @Nullable
    private Long id;

    @Nonnull
    private String number;

    @Nullable
    private String alias;

    @Nonnull
    private String capacity;

}
