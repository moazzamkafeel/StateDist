package mk.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import mk.app.entity.DistBean;
import mk.app.entity.LoginBean;
import mk.app.entity.StateBean;
import mk.app.service.ServiceInter;
@RestController
@RequestMapping("/open")
public class LoginController {
@Autowired
LoginBean loginbean;
@Autowired
ServiceInter serviceInter;

@GetMapping("/login")
public ModelAndView loginJsp()
	{
		return new ModelAndView("login","mk",loginbean);
	}
@ModelAttribute("statelist")
public List<StateBean> getStateList()
{
	List<StateBean> list = serviceInter.getState();
	return list;
}

@RequestMapping(value="dist", method= RequestMethod.GET)
public List<DistBean> getStateList(@RequestParam("stCode") String stCode)
{
	List<DistBean> list= serviceInter.getDistrict(stCode);
	return list;
	
}

@GetMapping("/fetchAll")   //THIK
public ResponseEntity<List<StateBean>> getAll()
{
List<StateBean> list = serviceInter.getList();
	return new ResponseEntity<List<StateBean>>(list,HttpStatus.OK);
}



}
