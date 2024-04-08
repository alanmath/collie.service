package insper.collie.service;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record MicroserviceOut (
    String id,
    String name,
    String linkRepositorio,
    String squadResponsavel
) {
    
}