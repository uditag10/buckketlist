package com.projectbuckketlistapp.entites;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the tbl_member database table.
 * 
 */
@Entity
@Table(name="tbl_member")
@NamedQuery(name="TblMember.findAll", query="SELECT t FROM TblMember t")
public class TblMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="member_id")
	private Long memberId;

	@Column(name="is_deleted")
	private Byte isDeleted;

	@Column(name="is_fb_auth")
	private Byte isFbAuth;

	@Column(name="member__fb_id")
	private String memberFbId;

	@Temporal(TemporalType.DATE)
	private Date member_DOB;

	@Column(name="member_first_name")
	private String memberFirstName;

	@Column(name="member_last_name")
	private String memberLastName;

	@Column(name="member_mail_address")
	private String memberMailAddress;

	@Column(name="member_phone")
	private BigInteger memberPhone;
	
	@Column(name="member_password")
	private String memberPassword;

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public TblMember() {
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Byte getIsFbAuth() {
		return this.isFbAuth;
	}

	public void setIsFbAuth(Byte isFbAuth) {
		this.isFbAuth = isFbAuth;
	}

	public String getMemberFbId() {
		return this.memberFbId;
	}

	public void setMemberFbId(String memberFbId) {
		this.memberFbId = memberFbId;
	}

	public Date getMember_DOB() {
		return this.member_DOB;
	}

	public void setMember_DOB(Date member_DOB) {
		this.member_DOB = member_DOB;
	}

	public String getMemberFirstName() {
		return this.memberFirstName;
	}

	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}

	public String getMemberLastName() {
		return this.memberLastName;
	}

	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}

	public String getMemberMailAddress() {
		return this.memberMailAddress;
	}

	public void setMemberMailAddress(String memberMailAddress) {
		this.memberMailAddress = memberMailAddress;
	}

	public BigInteger getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(BigInteger memberPhone) {
		this.memberPhone = memberPhone;
	}

}