package com.projectbuckketlistapp.entites;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;



/**
 * The persistent class for the tbl_bucket database table.
 * 
 */
@Entity
@Table(name="tbl_bucket")
@NamedQuery(name="TblBucket.findAll", query="SELECT t FROM TblBucket t")
public class TblBucket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="bucket_id")
	private Long bucketId;

	@Column(name="bucket_discription")
	private String bucketDiscription;

	@Column(name="bucket_name")
	private String bucketName;

	@Column(name="bucket_privacy")
	private String bucketPrivacy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_deleted")
	private Byte isDeleted;

	@Column(name="category_id")
	private String categoryId;


	@Column(name="created_by")
	private String createdBy;

	public TblBucket() {
	}

	public Long getBucketId() {
		return this.bucketId;
	}

	public void setBucketId(Long bucketId) {
		this.bucketId = bucketId;
	}

	public String getBucketDiscription() {
		return this.bucketDiscription;
	}

	public void setBucketDiscription(String bucketDiscription) {
		this.bucketDiscription = bucketDiscription;
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketPrivacy() {
		return this.bucketPrivacy;
	}

	public void setBucketPrivacy(String bucketPrivacy) {
		this.bucketPrivacy = bucketPrivacy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


}