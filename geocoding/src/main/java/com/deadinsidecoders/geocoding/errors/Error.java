package com.deadinsidecoders.geocoding.errors;

public class Error extends Exception
{
    private String message;
    private int cod;

    private Error(int cod, String message)
    {
        this.message = message;
        this.cod = cod;
    }

    public Error getError(int code)
    {
        switch (code)
        {
            case 0: return null;
            case 400: return new Error(code,"Error with input - The error message will start with: \"Illegal argument from request:\" followed by the specific error condition.");
            case 403: return new Error(code,"\tKey related error - The error message will attempt to explain why there was an error with the key and should provide a link to the Developer Network.");
            case 500: return new Error(code,"Unknown error - The error message will start with: \"Error processing request:\" followed by the message from the exception.");
            default: return new Error(-1,"Unknown  exception");
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getCod() {
        return cod;
    }
}
