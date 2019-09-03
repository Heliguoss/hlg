package com.emp.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.entity.User;

/**
 * 
 * @author jojt
 * User����Ŀ��Ʋ�
 */
@Controller()
public class UserController {
	
	//��ת����½ҳ��
	@RequestMapping("/user/toLogin")
	public String toLogin(){
		return "login";
	}
	@RequestMapping("/user/login")
	public String login(User user,Model model){
		
		//��ȡ��ǰ�û�,Subject���壬 ����/user/login����Ķ������û�������
		Subject subject=SecurityUtils.getSubject();
		//����һ�����ƶ���
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(), user.getPassword());
		try{
			//Ϊ��ǰ�û�������֤����Ȩ
			subject.login(token);
			//�ض�����ҳԱ���б�
			return "redirect:/emp/conditionList";
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "�û������������");
			return "login";
		}
	}
	
	@RequestMapping("/teacher")
	public String index() {
		return "index";
	}

}
