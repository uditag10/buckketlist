package com.projectbuckketlistapp.web.controllers;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectbuckketlistapp.DTO.LoginResponseDTO;
import com.projectbuckketlistapp.DTO.RegistrationRequestDTO;
import com.projectbuckketlistapp.entites.TblMember;
import com.projectbuckketlistapp.repositories.MemberRepo;
import com.projectbuckketlistapp.service.RegistrationService;

@RestController
public class RegistrationController {
	private static final Logger logger = LoggerFactory.getLogger(LoginControllers.class);

	@Autowired
	private MemberRepo member;
	
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public LoginResponseDTO getLogin(@RequestParam("username")String username,@RequestParam("passkey")String passkey,@RequestParam("name")String name,@RequestParam("phone")String phone) {
		
		logger.info("#############Welcome home! The client locale is {}.");
		
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//String formattedDate = dateFormat.format(date);
		LoginResponseDTO resp = new LoginResponseDTO();
		//model.addAttribute("serverTime", formattedDate );
		TblMember newMember = new TblMember();
		newMember.setMemberFirstName(name);
		newMember.setMemberPhone(new BigInteger(phone));
		newMember.setIsDeleted((byte)0);
		newMember.setMemberMailAddress(username);
		newMember.setMemberPassword(passkey);
		TblMember user = member.save(newMember);
		if(null != user){
			logger.info("######################### : "+ "sucess");
			resp.setUsername(username);
			
			//model.addAttribute("result", "sucess" );
		}else{
			resp.setErrorMsg(" sorry registration failed");
			logger.info("######################### : "+ "error");
			//model.addAttribute("result", "failed" );
		}
		return resp;
	}
}
