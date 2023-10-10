package com;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	private Dao dao;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/userhome")
	public void userhome() {

	}

	@RequestMapping("/register")
	public String Register(@ModelAttribute user u, Model m) {
		this.dao.insertUpdateUser(u);
		return "userhome";
	}

}
