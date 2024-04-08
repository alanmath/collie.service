package insper.collie.service.exceptions;

public class MicroserviceNotFoundException extends RuntimeException{

    public MicroserviceNotFoundException(String id){
        super("Microservice not found with id: " + id);
    }


}
