package com.projectbuckketlistapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projectbuckketlistapp.entites.TblMember;



public interface MemberRepo extends CrudRepository<TblMember, String> {

}
