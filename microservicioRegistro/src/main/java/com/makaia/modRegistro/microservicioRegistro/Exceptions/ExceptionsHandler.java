package com.makaia.modRegistro.microservicioRegistro.Exceptions;

import com.makaia.modRegistro.microservicioRegistro.Dtos.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResponseErrorHandler;

public class ExceptionsHandler {
    @ExceptionHandler(value = {RegistroApiException.class})
    public ResponseEntity<ResponseError> handleRegistroApiException(RegistroApiException reg){
        ResponseError res = new ResponseError(reg.getMessage(), reg.getCode().value());
        return new ResponseEntity<ResponseError>(res, reg.getCode());
    }
}
