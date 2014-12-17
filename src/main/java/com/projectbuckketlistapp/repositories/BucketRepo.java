package com.projectbuckketlistapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectbuckketlistapp.entites.TblBucket;

public interface BucketRepo extends CrudRepository<TblBucket, String> {
	
	List<TblBucket> findByCreatedBy(String createdBy);

}
