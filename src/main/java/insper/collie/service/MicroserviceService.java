package insper.collie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MicroserviceService {

    private final MicroserviceRepository microserviceRepository;

    @Autowired
    public MicroserviceService(MicroserviceRepository microserviceRepository) {
        this.microserviceRepository = microserviceRepository;
    }

    @Transactional
    public MicroserviceEntity createMicroservice(MicroserviceEntity microservice) {
        return microserviceRepository.save(microservice);
    }

    @Transactional(readOnly = true)
    public Optional<MicroserviceEntity> getMicroservice(Long id) {
        return microserviceRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<MicroserviceEntity> listAllMicroservices() {
        return microserviceRepository.findAll();
    }

    @Transactional
    public MicroserviceEntity updateMicroservice(Long id, MicroserviceEntity microservice) {
        MicroserviceEntity existingMicroservice = microserviceRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("Microservice with id " + id + " does not exist."));
        existingMicroservice.setName(microservice.getName());
        existingMicroservice.setSquadResponsavel(microservice.getSquadResponsavel());
        // Atualize outros campos conforme necessário
        return microserviceRepository.save(existingMicroservice);
    }

    @Transactional
    public void deleteMicroservice(Long id) {
        microserviceRepository.deleteById(id);
    }
}