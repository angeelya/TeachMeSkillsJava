package work38.home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import work38.Developer;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Service service;

    @GetMapping("")
    public String index() {
        return "/index";
    }
    @GetMapping(value = "/insert_user")
    public ModelAndView user() {
        return new ModelAndView("addUser", "command", new UsersApp());
    }
    @PostMapping("/addUser")
    public ModelAndView insert(@ModelAttribute() UsersApp userApp,
                           ModelMap model) {
        model.addAttribute("id", userApp.getId());
        model.addAttribute("login", userApp.getLogin());
        model.addAttribute("age", userApp.getAge());
        model.addAttribute("message", service.putUser(userApp));
        return new ModelAndView("user",model) ;
    }

    @GetMapping("/get_user/{id}")
    public ModelAndView get(@PathVariable String id,ModelMap model) {
        UsersApp usersApp = service.getByIdUser(id);
        if(usersApp!=null){
        model.addAttribute("id",usersApp.getId());
        model.addAttribute("login",usersApp.getLogin());
        model.addAttribute("age",usersApp.getAge());
        model.addAttribute("message","Successful");
            return new ModelAndView("user", model);}
        else return new ModelAndView("result","message","User isn't found ");

    }

    @GetMapping("/delete_user/{id}")
    public ModelAndView delete(@PathVariable String id) {
        return new ModelAndView("result", "message", service.deleteById(id));
    }

    @GetMapping("/update/{id}/{login}")
    public ModelAndView update(@PathVariable String id, @PathVariable String login) {
        return new ModelAndView("result", "message", service.updateLogin(id, login));
    }
}
