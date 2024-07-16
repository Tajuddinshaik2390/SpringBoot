package com.springboot.practice.springannotations.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SourceBean {
	@Value("${mail.host}")
	private String host;

	@Value("${mail.email}")
	private String gmail;

	@Value("${mail.password}")
	private String password;

	@Value("${app.Appname}")
	private String appname;

	@Value("${app.media}")
	private String mediaaa;
	public String getAppname() {
		return appname;
	}
	public String getMedia() {
		return mediaaa;
	}

	public String getHost() {
		return host;

	}

	public String getGmail() {
		return gmail;
	}

	public String getPassword() {
		return password;
	}

}
