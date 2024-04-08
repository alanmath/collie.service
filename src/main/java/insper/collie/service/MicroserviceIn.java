package insper.collie.service;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record MicroserviceIn (
    String name,
    String linkRepositorio,
    String squadResponsavel
) {
    
}