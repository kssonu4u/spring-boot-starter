package com.hdem.avm.core.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdem.avm.core.api.entity.ChildClip;
import com.hdem.avm.core.api.repository.ChildClipRepository;


@Service
public class ClipService {
	
	@Autowired
	private ChildClipRepository childClipRepository;
	
	public List<ChildClip> getAll() {
		return childClipRepository.findAll();
	}
}
