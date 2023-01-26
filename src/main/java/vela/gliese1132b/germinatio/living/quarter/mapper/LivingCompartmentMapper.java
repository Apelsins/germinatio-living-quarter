package vela.gliese1132b.germinatio.living.quarter.mapper;

import org.springframework.stereotype.Component;
import vela.gliese1132b.germinatio.living.quarter.dto.LivingCompartmentDTO;
import vela.gliese1132b.germinatio.living.quarter.entity.LivingCompartment;

import java.util.List;

@Component
public class LivingCompartmentMapper {

    public LivingCompartment toEntity(final LivingCompartmentDTO dto) {
        return new LivingCompartment(dto.getId(), dto.getNumber(), dto.getAlias(), dto.getCapacity());
    }

    public List<LivingCompartment> toListEntity(final List<LivingCompartmentDTO> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }

    public LivingCompartmentDTO toDTO(final LivingCompartment entity) {
        return new LivingCompartmentDTO(entity.getId(), entity.getNumber(), entity.getAlias(), entity.getCapacity());
    }

    public List<LivingCompartmentDTO> toListDTO(final List<LivingCompartment> entities) {
        return entities.stream().map(this::toDTO).toList();
    }
}
