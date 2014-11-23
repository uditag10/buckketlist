package com.projectbuckketlistapp.web.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.projectbuckketlistapp.entites.TblMember;
import com.projectbuckketlistapp.repositories.MemberRepo;



@Controller
public class LoginControllers {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginControllers.class);

	@Autowired
	private MemberRepo member;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLogin(Model model) {
		
		logger.info("#############Welcome home! The client locale is {}.");
		
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("serverTime", formattedDate );
		TblMember newMember = new TblMember();
		newMember.setMemberFirstName("udit");
		newMember.setMemberPhone(Integer.parseInt("73855"));
		newMember.setMemberMailAddress("udit@bc");
		TblMember user = member.save(newMember);
		if(null != user){
			logger.info("######################### : "+ "sucess");
			model.addAttribute("result", "sucess" );
		}else{
			logger.info("######################### : "+ "error");
			model.addAttribute("result", "failed" );
		}
		return "login";
	}
}
