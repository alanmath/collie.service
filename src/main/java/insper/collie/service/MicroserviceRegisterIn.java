package insper.collie.service;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record MicroserviceRegisterIn(
    String nome,
    String squadResponsavel
    // verificar se precisa mais.
) {

}
