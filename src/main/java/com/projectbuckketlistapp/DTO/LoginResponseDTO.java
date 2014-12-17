package com.projectbuckketlistapp.DTO;

import java.util.List;

import com.projectbuckketlistapp.entites.TblBucket;


public class LoginResponseDTO {
	
	 Boolean isError = true;
	 String errorMsg;
	 List<TblBucket> userBuckets = null;
	 String userId;
	 String username;
	public Boolean getIsError() {
		return isError;
	}
	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public List<TblBucket> getUserBuckets() {
		return userBuckets;
	}
	public void setUserBuckets(List<TblBucket> userBuckets) {
		this.userBuckets = userBuckets;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	 

}
