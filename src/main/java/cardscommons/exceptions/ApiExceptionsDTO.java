package cardscommons.exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiExceptionsDTO {
    private final String msg;
    private final int statusCode;
    private final HttpStatus httpStatus;
    private final ZonedDateTime time;

    public ApiExceptionsDTO(String msg, int statusCode,  HttpStatus httpStatus, ZonedDateTime time) {
        this.msg = msg;
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.time = time;
    }

    public String getMsg() {
        return msg;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    public ZonedDateTime getTime() {
        return time;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
