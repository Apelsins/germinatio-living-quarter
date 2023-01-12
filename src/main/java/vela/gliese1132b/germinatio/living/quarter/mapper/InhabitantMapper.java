package vela.gliese1132b.germinatio.living.quarter.mapper;

import org.springframework.stereotype.Component;
import vela.gliese1132b.germinatio.living.quarter.dto.InhabitantDTO;
import vela.gliese1132b.germinatio.living.quarter.entity.Inhabitant;

import java.util.List;

@Component
public class InhabitantMapper {

    public Inhabitant toEntity(final InhabitantDTO dto) {
        return new Inhabitant(dto.getId(), dto.getName());
    }

    public List<Inhabitant> toListEntity(final List<InhabitantDTO> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    public InhabitantDTO toDTO(final Inhabitant entity) {
        return new InhabitantDTO(entity.getId(), entity.getName());
    }

    public List<InhabitantDTO> toListDTO(final List<Inhabitant> entities) {
        return entities.stream().map(this::toDTO).toList();
    }
}
