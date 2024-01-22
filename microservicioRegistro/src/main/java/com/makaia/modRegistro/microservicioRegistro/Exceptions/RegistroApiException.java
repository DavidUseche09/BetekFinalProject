package com.makaia.modRegistro.microservicioRegistro.Exceptions;

import org.springframework.http.HttpStatusCode;

public class RegistroApiException extends RuntimeException {
    private HttpStatusCode code;
    public RegistroApiException(String message){
        super(message);
    }
    public RegistroApiException(String message, Throwable cause){
        super(message, cause);
    }
    public  RegistroApiException(String message, Throwable cause, HttpStatusCode code){
        super(message, cause);
        this.code = code;
    }
    public RegistroApiException(String message, HttpStatusCode code){
        super(message);
        this.code= code;
    }

    public HttpStatusCode getCode() {
        return code;
    }
}
