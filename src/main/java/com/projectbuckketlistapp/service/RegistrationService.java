package com.projectbuckketlistapp.service;

import com.projectbuckketlistapp.DTO.LoginResponseDTO;
import com.projectbuckketlistapp.DTO.RegistrationRequestDTO;

public interface RegistrationService {

	public LoginResponseDTO register(RegistrationRequestDTO request);
}
