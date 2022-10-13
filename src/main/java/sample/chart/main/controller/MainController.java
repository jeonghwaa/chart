package sample.chart.main.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sample.chart.main.Service.MainService;

import java.util.*;
import java.util.logging.Logger;

@Controller
@RequestMapping("/chart")
public class MainController {


    private MainService service;

    @GetMapping("/test")
    public String test(){
        return "index";
    }

    // 라인 차트
    @RequestMapping("/line1.do")
    public Object getChart1() {
        return "chart/line";
    }

    //parameter로 값 전달
    @RequestMapping("/line2.do")
    public String getLine(Model m, @RequestParam HashMap<Object,String> params) throws Exception {


        List<HashMap<Object,String>> result = new ArrayList<>();


        result.put(params);

        return "result";
    }

    //바 차트
    @RequestMapping("/bar.do")
    public Object getBar() {
        return "chart/bar";
    }
//    @RequestMapping("/bar1.do")
//    public Object getBar1(Model m, @RequestParam HashMap<Object, String> params) throws Exception {
//        List<HashMap<Object, String>> list = service.getLine2(params);
//        m.addAttribute("list", list);
//
//        return "chart/bar";
//    }


    // 파이차트
    @RequestMapping("/pie.do")
    public Object getPie() {
        return "chart/pie";
    }


}
