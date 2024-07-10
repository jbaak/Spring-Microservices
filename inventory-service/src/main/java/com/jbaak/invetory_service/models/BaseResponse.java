package com.jbaak.invetory_service.models;

public record BaseResponse(String[] errorMessages) {
    public boolean hasErrors() {
        return errorMessages !=null && errorMessages.length > 0;
    }
}
