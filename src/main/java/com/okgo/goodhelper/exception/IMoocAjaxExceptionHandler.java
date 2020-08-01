package com.okgo.goodhelper.exception;

import javax.servlet.http.HttpServletRequest;

import com.okgo.goodhelper.pojo.wxJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.okgo.goodhelper.pojo.wxJSONResult;

//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public wxJSONResult defaultErrorHandler(HttpServletRequest req,
											Exception e) throws Exception {

		e.printStackTrace();
		return wxJSONResult.errorException(e.getMessage());
	}
}
