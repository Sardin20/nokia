package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.multipart.MultipartFile;

public class UserListDAO 
{

	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template)
	{
		this.template=template;
	}
	
	public void register(User_Bean ub)throws IOException  
	{

		
		String s="insert into user_details(user_name,user_email,user_pass,user_role,user_country,user_district,user_sex)value('"+ub.getUname()+"','"+ub.getUemail()+"','"+ub.getUpass()+"','"+ub.getUocc()+"','"+ub.getUcountry()+"','"+ub.getUcity()+"','"+ub.getUsex()+"')";
		if(template.update(s)>0)
		{
			JOptionPane.showMessageDialog(null,"User Registered Successfully");
		}
	}
	

	
	
	
	public List<User_Bean> login(User_Bean nb) 
	{
	
		String s="select * from user_details where user_email='"+nb.getUemail()+"' and user_pass='"+nb.getUpass()+"'  ";
		List<User_Bean> list=template.query(s,new ViewMapper());
	    return list;
	}
	class ViewMapper implements RowMapper<User_Bean>
	{
		public User_Bean mapRow(ResultSet rs,int arg)throws SQLException
		{
			User_Bean nb=new User_Bean();
			nb.setUid(rs.getString("user_id"));
			nb.setUname(rs.getString("user_name"));
			nb.setUemail(rs.getString("user_email"));
			

			return nb;
		}

	}
	

	
}
