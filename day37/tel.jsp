<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
   		String tel = request.getParameter("tel");
   		// 010 --> 100, 011 --> 111
   		// 나머지는 랜덤하게
   		String result = "";
   		String pre = tel.substring(0, 3);	// 0~2까지 추출
   		switch(pre){
   		case "010":
   			result = result + "100";
   			break;
   		case "011":
   			result = result + "111";
   			break;
   		default:
   			result = result + "222";
   		}
   		
   		Random r = new Random();
   		int post = r.nextInt(900) + 100;	// 100~999(0~899 + 100)
   		result = result + post;
   %><%= result %>
