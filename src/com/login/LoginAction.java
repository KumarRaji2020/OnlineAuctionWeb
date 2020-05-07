package com.login;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction  implements SessionAware {  
		
		private String username,password;  
		private SessionMap<String,Object> sessionMap;  
		  
		//getters and setters  
		  
		@Override  
		public void setSession(Map<String, Object> map) {  
		    sessionMap=((SessionMap<String, Object>)map);  
		}  
		  
		
				
		public String getUsername() {
			return username;
		}




		public void setUsername(String username) {
			this.username = username;
		}




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
		}




		public String execute(){  
			if(password.equals("admin")){  
			    //sessionMap.put("login","true");  
			    //sessionMap.put("name",username);  
			      
			    return "success";  
			}  
			else{  
			    return "error";  
			}  
		}  
//			  
//			public String logout(){  
//			    if(sessionMap!=null){  
//			        sessionMap.invalidate();  
//			    }  
//			    return "success";  
//			}  
//			  
			}  

