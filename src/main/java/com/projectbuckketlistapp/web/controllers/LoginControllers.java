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

import com.projectbuckketlistapp.DTO.LoginRequestDTO;
import com.projectbuckketlistapp.DTO.LoginResponseDTO;
import com.projectbuckketlistapp.entites.TblMember;
import com.projectbuckketlistapp.repositories.MemberRepo;



@RestController
public class LoginControllers {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginControllers.class);

	@Autowired
	private MemberRepo member;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public LoginResponseDTO getLogin(@RequestParam("username")String username,@RequestParam("passkey")String passkey) {
		
		logger.info("#############Welcome home! The client locale is {}.");
		
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("serverTime", formattedDate );
		/*TblMember newMember = new TblMember();
		newMember.setMemberFirstName("udit");
		newMember.setMemberPhone(new BigInteger("7385522855"));
		newMember.setMemberMailAddress("udit@bc");
		TblMember user = member.save(newMember);
		if(null != user){
			logger.info("######################### : "+ "sucess");
			//model.addAttribute("result", "sucess" );
		}else{
			logger.info("######################### : "+ "error");
			//model.addAttribute("result", "failed" );
		}*/
		LoginResponseDTO rep = new LoginResponseDTO();
		TblMember user = member.findByMemberMailAddress(username);
		if(null!=user){
			if (user.getMemberPassword().equals(passkey)) {
				rep.setUsername( user.getMemberFirstName());
				rep.setUserId(user.getMemberId().toString());
			}else{
				rep.setErrorMsg( "wrong password");
			}
		}else{
			rep.setErrorMsg( "email not registered");
		}
		return rep;
	}
}
