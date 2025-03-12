package com.controller;

import java.io.IOException;
import java.util.List;


import javax.swing.JOptionPane;
import org.springframework.ui.ModelMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.model.UserListDAO;
import com.model.User_Bean;


@Controller

public class My_Controller 
{
	@Autowired
	UserListDAO dao;

	@RequestMapping(value="login")
	public String home()
	{
		return "login";
	}
	
	@RequestMapping(value="sign_up")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping(value="add_sign_up_details")
	public String add_signup_details(User_Bean ub) throws IOException
	{
		dao.register(ub);
		return "login";
	}



	@RequestMapping(value="login_check",method=RequestMethod.POST)
	public String login(User_Bean ub,ModelMap m)
	{

		List<User_Bean> user_list=dao.login(ub);

		System.out.println("email="+ub.getUemail());
		


		 if(user_list.size()>0)
		{
			
            m.put("Userlist", user_list);
            return "user_profile";
		}

		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Email and Password");

			return "login";
		}

	}

}



