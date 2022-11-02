package acc.apps;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@RestControllerAdvice
public class NotFoundExeption extends RuntimeException{

	public NotFoundExeption() {
		super();
	}
	
	public NotFoundExeption(String massage) {
		super(massage);
	}
	
}
