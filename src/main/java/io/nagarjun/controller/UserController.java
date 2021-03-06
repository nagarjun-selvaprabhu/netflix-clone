package io.nagarjun.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import io.nagarjun.MovieSpecification;
import io.nagarjun.SearchCriteria;
import io.nagarjun.SearchOperation;
import io.nagarjun.model.Movie;
import io.nagarjun.model.User;
import io.nagarjun.model.cookie;
import io.nagarjun.model.rating;
import io.nagarjun.model.sort;
import io.nagarjun.repo.MovieRepository;
import io.nagarjun.repo.UserRepository;
import io.nagarjun.repo.sortRepository;

@Controller
public class UserController {
	 private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository urepo;

	@Autowired
	MovieRepository mov;
	
	@Autowired
	sortRepository s;

	@RequestMapping("/")
	public String home(Model model) {
		logger.debug("INSIDE / MAIN");
		sort sov = new sort();
		model.addAttribute("movie", mov.findAll());
		model.addAttribute("sort", sov);
		return "home";
	}

	@RequestMapping("/sort")
	public String sortedForm(@ModelAttribute("sort") sort sov,Model model) {
		logger.debug("INSIDE /SORT METHOD");
		String genre = sov.getGenre();
		MovieSpecification msGenre = new MovieSpecification();
		msGenre.add(new SearchCriteria("genre", genre , SearchOperation.EQUAL));
		List<Movie> msGenreList = s.findAll(msGenre);
		model.addAttribute("movie",s.findAll(msGenre));
		return "sortedHome";
	}

	@RequestMapping("/rating")
	public String getRating(@ModelAttribute("rating") rating rat,Model model,HttpServletResponse res) {
		logger.debug("INSIDE /getRating METHOD");
		return "rating";
	}
	
	@RequestMapping("/rate")
	public String rate(rating rat,HttpServletResponse res) {
		logger.debug("INSIDE /rate METHOD");
		int num = rat.getNumber();
		String str = Integer.toString(num); 
		Cookie cook = new Cookie( "rating", str);
		res.addCookie(cook);
		return "rate";
	}
	
	@RequestMapping("/rateFromCookie")
	public ModelAndView rateFromCookie(@CookieValue(value = "rating" , defaultValue = "3")String a,ModelAndView m) {
		logger.debug("INSIDE /rateFromCookie METHOD");
		System.out.println(a);
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("message" , " The Rating Stored in the cookie is "+a);
		return mv;
		
	}
	
	
	@RequestMapping("/signup")
	public String getSignup() {
		logger.debug("INSIDE /getSignup METHOD");
		return "signup";
	}

	@RequestMapping("/login")
	public String getLogin() {
		logger.debug("INSIDE /getLogin METHOD");
		return "login";
	}
	

	@RequestMapping(value = "/content")
	public String content() {
		logger.debug("INSIDE /getcontent METHOD");
		return "content";
	}

	@PostMapping(value = "/content")
	public String contentUpload(cookie cook, Model model) {
		logger.debug("INSIDE /contentUpload METHOD");
		String name = cook.getName();
		String url = cook.getUrl();
		System.out.println(name);
		System.out.println(url);
		mov.saveAll(Arrays.asList(new Movie(name, "Drama", 9, url)));
		model.addAttribute("movie", mov.findAll());
		return "updatedHome";
	}

	@PostMapping("/addUser")
	public String addUser(@RequestParam("user_email") String user_email, User user) {
		logger.debug("INSIDE /addUser METHOD");
		ModelAndView mv = new ModelAndView("success");
		List<User> list = urepo.findByEMAIL(user_email);

		if (list.size() != 0) {
			mv.addObject("message", "Oops!  There is already a user registered with the email provided.");
			return "home";

		} else {
			urepo.save(user);
			mv.addObject("message", "User has been successfully registered.");
			return "redirect:/signup";
		}

	}

	@GetMapping("/dummy")
	public String dummy() {
		logger.debug("INSIDE /dummy METHOD");
		return "dummy";
	}

	@PostMapping("/login")
	public String login_user(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, ModelMap modelMap, Model model,sort so) {
		
		logger.debug("INSIDE /login_user METHOD");

		User auser = urepo.findByUsernamePassword(username, password);
		String uname = auser.getUser_email();
		String upass = auser.getUser_pass();

		if (uname.equalsIgnoreCase("admin@gmail.com") && upass.equalsIgnoreCase("root")) {
			model.addAttribute("movie", mov.findAll());
			return "adminHome";
		} else {

			if (username.equalsIgnoreCase(uname) && password.equalsIgnoreCase(upass)) {
				session.setAttribute("username", username);
				model.addAttribute("movie", mov.findAll());
				return "home";
			} else {
				modelMap.put("error", "Invalid Account");
				return "login";
			}
		}

	}

	@GetMapping(value = "/logout")
	public String logout_user(HttpSession session) {
		logger.debug("INSIDE /logout_user METHOD");
		session.removeAttribute("username");
		session.invalidate();
		return "redirect:/login";
	}

}
