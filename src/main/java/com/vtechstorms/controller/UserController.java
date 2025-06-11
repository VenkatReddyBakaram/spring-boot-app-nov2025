package com.vtechstorms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vtechstorms.dtos.StudentDto;
import com.vtechstorms.dtos.UserDto;
import com.vtechstorms.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/*
	 * @Autowired private ModelAndView modelAndView;
	 */
	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.POST) public
	 * String login(HttpServletRequest request) {
	 * 
	 * String userName = request.getParameter("userName"); String password =
	 * request.getParameter("password");
	 * 
	 * return userService.login(userName, password); }
	 */

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public String
	 * login(@RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String password) {
	 * 
	 * 
	 * 
	 * return userService.login(userName, password); }
	 */

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public String
	 * login(UserDto userDto) { return userService.login(userDto.getUserName(),
	 * userDto.getPassword()); }
	 */

	/*
	 * @RequestMapping(value = "/doLogin",method = RequestMethod.GET) public
	 * ModelAndView doLogin(UserDto userDto) { ModelAndView modelAndView = new
	 * ModelAndView(); String pageName = userService.login(userDto.getUserName(),
	 * userDto.getPassword()); modelAndView.setViewName(pageName); return
	 * modelAndView;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public
	 * ModelAndView doLogin(UserDto userDto) { // ModelAndView modelAndView = new
	 * ModelAndView();
	 * 
	 * String pageName = userService.login(userDto.getUserName(),
	 * userDto.getPassword()); ModelAndView modelAndView = new
	 * ModelAndView(pageName); // modelAndView.setViewName(pageName); return
	 * modelAndView;
	 * 
	 * }
	 */

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("user") UserDto userDto, Model model, HttpSession httpSession) {

		String view = userService.login(userDto.getUserName(), userDto.getPassword());
		model.addAttribute("userName", userDto.getUserName());
		httpSession.setAttribute("userName", userDto.getUserName());
		httpSession.setMaxInactiveInterval(10);
		return view;
	}

	@RequestMapping(value = "/userDetails", method = RequestMethod.GET)
	public ModelAndView userDetails(ModelAndView modelAndView, HttpSession httpSession) {

		String userName = (String) httpSession.getAttribute("userName");
		modelAndView.addObject("userName", userName);
		modelAndView.setViewName("userDetails");
		return modelAndView;
	}

	@RequestMapping(value = "/userProfile", method = RequestMethod.GET)
	public ModelAndView userProfile(ModelAndView modelAndView, HttpSession httpSession) {

		String userName = (String) httpSession.getAttribute("userName");
		modelAndView.addObject("userName", userName);
		modelAndView.setViewName("userProfile");
		return modelAndView;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "logout";
	}

	/*
	 * @RequestMapping(value = "/students", method = RequestMethod.GET) public
	 * ModelAndView students(ModelAndView modelAndView) {
	 * modelAndView.setViewName("students");
	 * 
	 * modelAndView.addObject("studId", "104"); modelAndView.addObject("studName",
	 * "Venkat Reddy"); modelAndView.addObject("email", "venkat@gmail.com");
	 * modelAndView.addObject("phoneNumber", "9987383928");
	 * 
	 * 
	 * return modelAndView; }
	 */

	/*
	 * @RequestMapping(value = "/students", method = RequestMethod.GET) public
	 * ModelAndView students(ModelAndView modelAndView) {
	 * modelAndView.setViewName("students");
	 * 
	 * StudentDto studentDto = new StudentDto();
	 * 
	 * studentDto.setStudId("105"); studentDto.setStudName("Venkat Reddy");
	 * studentDto.setEmail("venkatr@gmail.com");
	 * studentDto.setPhoneNumber("9987384628");
	 * 
	 * modelAndView.addObject("studId", "104"); modelAndView.addObject("studName",
	 * "Venkat Reddy"); modelAndView.addObject("email", "venkat@gmail.com");
	 * modelAndView.addObject("phoneNumber", "9987383928");
	 * 
	 * modelAndView.addObject("students", studentDto);
	 * 
	 * return modelAndView; }
	 */

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView students(ModelAndView modelAndView) {
		modelAndView.setViewName("students");

		List<StudentDto> listOfStudents = new ArrayList<>();

		StudentDto studentDto1 = new StudentDto();

		studentDto1.setStudId("105");
		studentDto1.setStudName("Venkat Reddy");
		studentDto1.setEmail("venkatr@gmail.com");
		studentDto1.setPhoneNumber("9987384628");

		StudentDto studentDto2 = new StudentDto();

		studentDto2.setStudId("106");
		studentDto2.setStudName("John");
		studentDto2.setEmail("venkatr@gmail.com");
		studentDto2.setPhoneNumber("9987384628");

		StudentDto studentDto3 = new StudentDto();

		studentDto3.setStudId("107");
		studentDto3.setStudName("Smith");
		studentDto3.setEmail("venkatr@gmail.com");
		studentDto3.setPhoneNumber("9987384628");

		listOfStudents.add(studentDto1);
		listOfStudents.add(studentDto2);
		listOfStudents.add(studentDto3);

		modelAndView.addObject("studId", "104");
		modelAndView.addObject("studName", "Venkat Reddy");
		modelAndView.addObject("email", "venkat@gmail.com");
		modelAndView.addObject("phoneNumber", "9987383928");

		modelAndView.addObject("students", listOfStudents);

		modelAndView.setViewName("students");

		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public
	 * ModelAndView doLogin(UserDto userDto, ModelAndView modelAndView) { String
	 * pageName = userService.login(userDto.getUserName(), userDto.getPassword());
	 * modelAndView.setViewName(pageName); return modelAndView;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public
	 * ModelAndView doLogin(UserDto userDto) { String pageName =
	 * userService.login(userDto.getUserName(), userDto.getPassword());
	 * modelAndView.setViewName(pageName); return modelAndView;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/doLogin", method = RequestMethod.GET) public
	 * ModelAndView doLogin(UserDto userDto, ModelAndView modelAndView) { String
	 * pageName = userService.login(userDto.getUserName(), userDto.getPassword());
	 * 
	 * modelAndView.addObject("userName",userDto.getUserName());
	 * modelAndView.setViewName(pageName); return modelAndView; }
	 */}
