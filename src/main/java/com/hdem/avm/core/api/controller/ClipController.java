package com.hdem.avm.core.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdem.avm.core.api.entity.ChildClip;
import com.hdem.avm.core.api.service.ClipService;

@RestController
@RequestMapping("/clip")
public class ClipController {
	
	@Autowired
	private ClipService clipService;
	
	@GetMapping()
	public List<ChildClip> getAll(HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_OK);
		return clipService.getAll();
	}
}
