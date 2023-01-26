package vela.gliese1132b.germinatio.living.quarter.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import vela.gliese1132b.germinatio.living.quarter.dto.InhabitantDTO;
import vela.gliese1132b.germinatio.living.quarter.entity.Inhabitant;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class InhabitantMapper {

    private final LivingCompartmentMapper livingCompartmentMapper;

    public Inhabitant toEntity(final InhabitantDTO dto) {
        return new Inhabitant(dto.getId(), dto.getName(), null);
    }

    public List<Inhabitant> toListEntity(final List<InhabitantDTO> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    public InhabitantDTO toDTO(final Inhabitant entity) {
        return new InhabitantDTO(
                entity.getId(),
                entity.getName(),
                entity.getLivingCompartments().stream()
                      .map(livingCompartmentMapper::toDTO)
                      .collect(Collectors.toSet())
        );
    }

    public List<InhabitantDTO> toListDTO(final List<Inhabitant> entities) {
        return entities.stream().map(this::toDTO).toList();
    }
}
