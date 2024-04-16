package insper.collie.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "collie-microservices")
public interface MicroserviceController {
    
    @PostMapping("/microservices")
    public ResponseEntity<MicroserviceOut> create(
        @RequestBody(required = true) MicroserviceIn in
    );

    @PutMapping("/microservices/{id}")
    public ResponseEntity<MicroserviceOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) MicroserviceIn in
    );

    @GetMapping("/microservices")
    public ResponseEntity<List<MicroserviceOut>> read();

    @GetMapping("/microservices/{id}")
    public ResponseEntity<MicroserviceAll> readById(
        @PathVariable(required = true) String id
    );

    @DeleteMapping("/microservices/{id}")
    public ResponseEntity<MicroserviceOut> delete(
        @PathVariable(required = true) String id
    );

    @PostMapping("/microservices/{id}/trivy")
    public void trivy(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) TrivyReportIn in
    );
}
