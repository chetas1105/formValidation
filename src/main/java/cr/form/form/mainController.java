package cr.form.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mainController {

    @GetMapping(path = "/register")
    public String getForm(Model model){
        model.addAttribute("Employee",new Signupform());
        return "form";
    }

    @PostMapping(path = "/register1")
    public String postForm(@ModelAttribute Signupform signupform, BindingResult result, Model model){
        model.addAttribute("Employee",signupform);
        return "successful_registered";
    }
}
