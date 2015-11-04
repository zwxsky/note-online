package com.personal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping(method= RequestMethod.GET)
	public String doGet(HttpServletRequest request, HttpServletResponse response){
		
		return "order/order";
	}

}
