package com.hdem.avm.core.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.hdem.avm.core.api.utils.Constants;

@SpringBootApplication
public class HDEMAVMCoreAPIApplication {
	private static final Logger logger = LoggerFactory.getLogger(HDEMAVMCoreAPIApplication.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder()
		.sources(HDEMAVMCoreAPIApplication.class)
		.run(args);
		logger.info(Constants.APPNAME + " started sucessfully!!!");
	}
}
