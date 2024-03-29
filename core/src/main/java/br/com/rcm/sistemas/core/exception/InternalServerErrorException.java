package br.com.rcm.sistemas.core.exception;

public class InternalServerErrorException extends Exception{

    private String code;

    public InternalServerErrorException(String message, String code) {
        super(message);
        this.code = code;
    }
}
