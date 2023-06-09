package jp.co.trainocamp.demo.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.trainocamp.demo.mybatis.mapper.UserMapper;

@Controller
public class UserListController {
	@Autowired
	private UserMapper userMapper;

	@GetMapping("/users")
	public ModelAndView listAll(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("users", userMapper.selectAll());
		return mav;
	}

}
