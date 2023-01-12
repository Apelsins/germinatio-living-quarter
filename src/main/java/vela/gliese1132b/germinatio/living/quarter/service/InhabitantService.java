package vela.gliese1132b.germinatio.living.quarter.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vela.gliese1132b.germinatio.living.quarter.dto.InhabitantDTO;
import vela.gliese1132b.germinatio.living.quarter.mapper.InhabitantMapper;
import vela.gliese1132b.germinatio.living.quarter.repository.InhabitantRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class InhabitantService {

    private final InhabitantRepository inhabitantRepository;
    private final InhabitantMapper inhabitantMapper;

    public List<InhabitantDTO> getAllInhabitants() {
        return inhabitantMapper.toListDTO(
                inhabitantRepository.findAll());
    }
}
