package com.manage.fixtures.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.manage.fixtures.Domain.commonCode;
import com.manage.fixtures.Domain.fixtures;
import com.manage.fixtures.Repository.commonCodeRepository;
import com.manage.fixtures.Repository.fixturesRepository;


@Controller
@RequestMapping("/fixtures")
public class fixturesController {

	//rest
	@Autowired
	private fixturesRepository fixturesDao;
	@Autowired
	private commonCodeRepository commonDao;
	
	

	@RequestMapping("/index")
	public String getIndex(){
		System.out.println("ddddaaaaaaaaaaaaaaaaaaaaaa111111111");
		return "index";
	}

	@RequestMapping("/itemManage")
	public String itmeManage(Model model){
		//model.addAttribute("name","hello springBoot1234");
		System.out.println("ddddaaaaaaaaaaaaaaaaaaaaaa");
		List<fixtures> list = fixturesDao.findAll();
		List<commonCode> list2 = commonDao.findAll();
		model.addAttribute("list",list);
		model.addAttribute("listCode",list2);
		
		for( commonCode m : list2 ){
			System.out.println(m.toString());
			//System.out.println(m.getCODE_ID());
			//System.out.println(m.getCODE_NAME());
			
		}
		
		return "fixturesManage";
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
