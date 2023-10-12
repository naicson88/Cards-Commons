package cardscommons.exceptions;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;


public class ApiExceptionsDTO {
    private final String msg;
    private final int statusCode;
    private final HttpStatus httpStatus;
    private ZonedDateTime time;
    private String path;
    private String exceptionType;

    public ApiExceptionsDTO(String msg, int statusCode, HttpStatus httpStatus, ZonedDateTime time, String path, String exceptionType) {
        this.msg = msg;
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.time = time;
        this.path = path;
        this.exceptionType = exceptionType;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getMsg() {
        return msg;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public int getStatusCode() {
        return statusCode;
    }

}
