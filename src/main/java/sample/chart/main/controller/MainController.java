package sample.chart.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sample.chart.main.Service.MainService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public String lineTest(Model m, @RequestParam List<Map<Object, String>> paramsList,HttpServletRequest request) throws Exception {
        List<Map<Object, String>> mapList = new ArrayList<>();
        String bk_day = "";
        String bk_name = "";

        List<Map<Object, String>> paramList = new ArrayList<>();

        for ( Map<Object, String> params : paramList) {
            System.out.println(params);

            bk_day = (String) params.get("bk_day");
            bk_name = (String) params.get("bk_name");

            if (paramList != null) {
                paramList = service.getLine2(params);

            }
            mapList.add(params);
            System.out.println("mapList : " +mapList);

        }
        return "chart/line";

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
