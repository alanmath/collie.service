package insper.collie.service;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record MicroserviceInfo(
    Long id,
    String nome,
    String squadResponsavel
    // Verificar se precisa de mais
) {

}
