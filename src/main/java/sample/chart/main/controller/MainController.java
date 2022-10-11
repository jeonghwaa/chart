package sample.chart.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")
public class MainController {


    @GetMapping("/test")
    public String test(){
        return "index";
    }

    @RequestMapping("/line1.do")
    public Object getChart1() {
        return "chart/line1";
    }


}
