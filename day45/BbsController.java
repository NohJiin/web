package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;

	@RequestMapping("insert2")
	public void insert(BbsVO bag, BbsDAO dao) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update2")
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("update22")
	public void update2(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2")
	public void delete(int no, BbsDAO dao) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one2")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		model.addAttribute("bag", bag);
		
		// 댓글 가져오기
		// ReplyDAO중 list의 반환값 = ArrayList<ReplyVO>형태(가방에 담긴 값들의 모음)
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
	}
	
	// 댓글 기능을 제한함
	@RequestMapping("one6")
	public void one6(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		model.addAttribute("bag", bag);
		
//		// 댓글 가져오기
//		// ReplyDAO중 list의 반환값 = ArrayList<ReplyVO>형태(가방에 담긴 값들의 모음)
//		ArrayList<ReplyVO> list = dao2.list(no);
//		model.addAttribute("list", list);
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); //사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); //사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("test")
	public void test() {
		System.out.println("입력창 생성됨");
	}
}