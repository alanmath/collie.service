package insper.collie.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroserviceRepository extends JpaRepository<MicroserviceEntity, Long> {

    List<MicroserviceEntity> findByNome(String nome);

    List<MicroserviceEntity> findBySquadResponsavel(String squadResponsavel);

}