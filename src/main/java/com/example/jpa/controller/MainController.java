package com.example.jpa.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jpa.domain.User;
import com.example.jpa.repository.UserRepository;

@Controller
@RequestMapping(path="/demo")
public class MainController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/open")
	public String open(Model model) {
		model.addAttribute("user", new User());
        return "insertUser.html";
	}
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public String addNewUser (@RequestParam String name, @RequestParam String email, Model model) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		
		model.addAttribute("user", new User());
		return "insertUser.html";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping(path="/delete")
	public @ResponseBody String deleteUser(@RequestParam int id) {
		User n = new User();
		n.setId(id);
		userRepository.delete(n);
		return "Deleted";
	}
}