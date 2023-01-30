package com.himani.niet.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.himani.niet.spring.model.Student;


/**
 * 
 * @author Himani Sharma
 *
 */
@Controller
public class HomeController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String user(Student student, Model model) {
		System.out.println("Student Page Requested");
		Integer rollNo = Integer.parseInt(student.getRollNo());
		model.addAttribute("studentName", student.getStudentName());
		model.addAttribute("rollNo", student.getRollNo());
		return "student";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
    public String numberformatHandler(Model theModel) { 
        theModel.addAttribute("err", "NumberFormatException");
        return "error";
    }
}
