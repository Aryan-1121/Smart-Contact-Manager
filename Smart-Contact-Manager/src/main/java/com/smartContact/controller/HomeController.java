package com.smartContact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartContact.dao.UserRepository;
import com.smartContact.model.Contact;
import com.smartContact.model.User;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setEmail("user2@abc.com");
		user.setRole("N/A");
		user.setName("user2");
		Contact contact = new Contact();
		user.getContacts().add(contact);
		
		userRepository.save(user);
		
		return "user Details Saved :"+ user.toString();
	}
	
	
}
