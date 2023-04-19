 package com.multi.mvc901;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("insert요청됨");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
}