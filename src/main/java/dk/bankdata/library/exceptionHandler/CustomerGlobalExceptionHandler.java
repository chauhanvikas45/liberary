package dk.bankdata.library.exceptionHandler;

import dk.bankdata.library.exceptions.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@ControllerAdvice
public class CustomerGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public void bookNotFoundException(HttpServletResponse response)throws IOException{
        response.sendError(HttpStatus.NOT_FOUND.value());
    }


}
