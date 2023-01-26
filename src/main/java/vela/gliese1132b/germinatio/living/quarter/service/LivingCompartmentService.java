package vela.gliese1132b.germinatio.living.quarter.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vela.gliese1132b.germinatio.living.quarter.dto.InhabitantDTO;
import vela.gliese1132b.germinatio.living.quarter.dto.LivingCompartmentDTO;
import vela.gliese1132b.germinatio.living.quarter.mapper.InhabitantMapper;
import vela.gliese1132b.germinatio.living.quarter.mapper.LivingCompartmentMapper;
import vela.gliese1132b.germinatio.living.quarter.repository.InhabitantRepository;
import vela.gliese1132b.germinatio.living.quarter.repository.LivingCompartmentRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class LivingCompartmentService {

    private final LivingCompartmentRepository livingCompartmentRepository;
    private final LivingCompartmentMapper livingCompartmentMapper;

    public List<LivingCompartmentDTO> getAllLivingCompartment() {
        return livingCompartmentMapper.toListDTO(
                livingCompartmentRepository.findAll());
    }
}
