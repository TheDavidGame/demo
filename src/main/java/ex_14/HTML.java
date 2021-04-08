package ex_14;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class HTML {
    @GetMapping("/home")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="opa") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }
}
