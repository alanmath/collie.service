package insper.collie.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "collie-microservices")
public interface MicroserviceController {

    // Criação de um novo microserviço
    @PostMapping("/microservices")
    ResponseEntity<MicroserviceInfo> createMicroservice(
        @RequestBody MicroserviceRegisterIn microserviceRegisterIn
    );

    // Obter um microserviço específico pelo ID
    @GetMapping("/microservices/{id}")
    ResponseEntity<MicroserviceInfo> getMicroservice(
        @PathVariable("id") Long id
    );

    // Atualizar um microserviço pelo ID
    @PutMapping("/microservices/{id}")
    ResponseEntity<MicroserviceInfo> updateMicroservice(
        @PathVariable("id") Long id, 
        @RequestBody MicroserviceRegisterIn microserviceRegisterIn
    );

    // Deletar um microserviço pelo ID
    @DeleteMapping("/microservices/{id}")
    ResponseEntity<Void> deleteMicroservice(
        @PathVariable("id") Long id
    );

    // Listar todos os microserviços
    @GetMapping("/microservices")
    ResponseEntity<List<MicroserviceInfo>> listAllMicroservices();
}
