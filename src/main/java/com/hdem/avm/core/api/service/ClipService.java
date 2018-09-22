package com.hdem.avm.core.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hdem.avm.core.api.entity.ChildClip;

@Service
public class ClipService {
	
	public List<ChildClip> getAll() {
		return new ArrayList<ChildClip>();
	}
}
