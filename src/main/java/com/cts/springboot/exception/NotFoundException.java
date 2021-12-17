package com.cts.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    private String resource;
    private String field;
    private Object fieldValue;
    public NotFoundException(String resource, String field, Object fieldValue) {
        super(String.format("%s not found with %s :'%s'", resource,field,fieldValue));
        // this.setResource(resource);
        // this.setField(field);
        // this.setFieldValue(fieldValue);
    }
    public Object getFieldValue() {
        return fieldValue;
    }
    // public void setFieldValue(Object fieldValue) {
    //     this.fieldValue = fieldValue;
    // }
    public String getField() {
        return field;
    }
    // public void setField(String field) {
    //     this.field = field;
    // }
    public String getResource() {
        return resource;
    }
    // public void setResource(String resource) {
    //     this.resource = resource;
    // }

}
