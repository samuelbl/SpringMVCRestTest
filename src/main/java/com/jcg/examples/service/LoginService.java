package com.jcg.examples.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.springframework.stereotype.Service;

import com.jcg.examples.bean.LoginBean;
import com.jcg.examples.bean.MfaPojo;

@Service
public class LoginService
{
		public String validateUser(LoginBean loginBean)
		{
				consumeRest();
				String userName = loginBean.getUserName();
				String password = loginBean.getPassword();
				if(userName.equals("samuel") && password.equals("samuel"))
				{
						return "true";
				}
				else
				{
						return "false";
				}
		}
		
		public void consumeRest() {
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://localhost:8080/mfaprovider/resource/mfa").path("aluno@idp");
			MfaPojo mfapojo = new MfaPojo();
			Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
			Response response = invocationBuilder.get();
			String pojo = response.readEntity(String.class);
			System.out.println(pojo);
			System.out.println(response.toString());
		}
		
		
		
}
