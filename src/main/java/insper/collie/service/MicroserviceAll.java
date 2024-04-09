package insper.collie.service;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record MicroserviceAll (
    String id,
    String name,
    String linkRepository,
    String squad_id,
    String squadName
) {
    
}