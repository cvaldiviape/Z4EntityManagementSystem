package com.cvaldiviape.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.cvaldiviape.dto.response.ErrorDetailResponseDTO;
import com.cvaldiviape.util.AppHelpers;

@ControllerAdvice 
public class GlobalHandlerException  extends ResponseEntityExceptionHandler {

	@Autowired
	private AppHelpers appHelpers;
	
	@ExceptionHandler(ResourceNotFoundException.class) 
	public ResponseEntity<ErrorDetailResponseDTO> managerResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
		String dateTime = this.appHelpers.convertLocalDateTimeToString(LocalDateTime.now());
		ErrorDetailResponseDTO errorDetailResponseDTO = new ErrorDetailResponseDTO(dateTime, exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<ErrorDetailResponseDTO>(errorDetailResponseDTO, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StandarException.class)
	public ResponseEntity<ErrorDetailResponseDTO> managerMangaGodAppException(StandarException exception, WebRequest webRequest){
		String dateTime = this.appHelpers.convertLocalDateTimeToString(LocalDateTime.now());
		ErrorDetailResponseDTO errorDetailResponseDTO = new ErrorDetailResponseDTO(dateTime, exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<ErrorDetailResponseDTO>(errorDetailResponseDTO, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetailResponseDTO> managerException(Exception exception, WebRequest webRequest){
		String dateTime = this.appHelpers.convertLocalDateTimeToString(LocalDateTime.now());
		ErrorDetailResponseDTO errorDetailResponseDTO = new ErrorDetailResponseDTO(dateTime, exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<ErrorDetailResponseDTO>(errorDetailResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({ AuthenticationException.class })
    @ResponseBody
    public ResponseEntity<ErrorDetailResponseDTO> managerAuthenticationException(AuthenticationException exception, WebRequest webRequest) {
        String dateTime = this.appHelpers.convertLocalDateTimeToString(LocalDateTime.now());
		ErrorDetailResponseDTO errorDetailResponseDTO = new ErrorDetailResponseDTO(dateTime, exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<ErrorDetailResponseDTO>(errorDetailResponseDTO, HttpStatus.UNAUTHORIZED);		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, 
			                                                      HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<String, String>();	
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String nameField = ((FieldError)error).getField();
			String message = error.getDefaultMessage();
			errors.put(nameField, message);
		});
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
	
}