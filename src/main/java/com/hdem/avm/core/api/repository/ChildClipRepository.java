package com.hdem.avm.core.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hdem.avm.core.api.entity.ChildClip;

@Repository
public interface ChildClipRepository extends MongoRepository<ChildClip, String> {

}
