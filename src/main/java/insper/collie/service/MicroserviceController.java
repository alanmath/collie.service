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
    public ResponseEntity<List<MicroserviceOut>> read(
        // @RequestHeader(required = true, name = "id-user") String idUser,
        // @RequestHeader(required = true, name = "role-user") String roleUser
    );

    @GetMapping("/microservices/{id}")
    public ResponseEntity<MicroserviceOut> readById(
        @PathVariable(required = true) String id
        // @RequestHeader(required = true, name = "id-user") String idUser,
        // @RequestHeader(required = true, name = "role-user") String roleUser
    );

    @DeleteMapping("/microservices/{id}")
    public ResponseEntity<MicroserviceOut> delete(
        @PathVariable(required = true) String id
        // @RequestHeader(required = true, name = "id-user") String idUser,
        // @RequestHeader(required = true, name = "role-user") String roleUser
    );
}
