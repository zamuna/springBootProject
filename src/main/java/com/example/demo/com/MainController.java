package com.example.demo.com;

import com.example.demo.com.DAO.ICastDao;
import com.example.demo.com.model.Cast;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


/**
 * Created by Zamuna on 8/7/2017.
 */
@Controller
public class MainController {
//    @Resource
    //private ICastDao castDao;
    @RequestMapping("/")
    public String redirectRoot() {
        System.out.println("root");
        return "addCast";
    }

//    @RequestMapping(value="/cast", method= RequestMethod.GET)
//    public String getAll(Model model) {
////        model.addAttribute("cast", castDao.getAll());
//        System.out.println("Cast add");
//        return "addCast";
//    }
//
//    @RequestMapping(value="/castAdd", method= RequestMethod.POST)
//    public String add(Cast cast) {
//        castDao.add(cast);
//        return redirectRoot();
//    }

//    @RequestMapping(value="/cast/{id}", method=RequestMethod.GET)
//    public String get(@PathVariable int id, Model model) {
//        model.addAttribute("cast", castDao.get(id));
//        return "castDetail";
//    }
//
//    @RequestMapping(value="/cast/{id}", method=RequestMethod.POST)
//    public String update(Cast cast, @PathVariable int id) {
//        castDao.update(id, cast); // car.id already set by binding
//        return "redirect:/cars";
//    }
//
//    @RequestMapping(value="/cast/delete", method=RequestMethod.POST)
//    public String delete(int castId) {
//        castDao.delete(castId);
//        return "redirect:/cast";
//    }


//    @ExceptionHandler(value=NoSuchResourceException.class)
//    public ModelAndView handle(Exception e) {
//        ModelAndView mv = new ModelAndView();
//        mv.getModel().put("e", e);
//        mv.setViewName("noSuchResource");
//        return mv;
//    }


}
