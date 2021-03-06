package com.test.sp11.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.sp11.entity.TestVO;

@Controller
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/test")
	public String doUpload(Model m, @ModelAttribute TestVO tVO) {
		m.addAttribute("tVO",tVO);
		log.debug("tVO=>{}",tVO);
		return "complete";
	}

}
