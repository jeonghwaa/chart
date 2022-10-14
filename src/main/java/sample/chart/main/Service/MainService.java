package sample.chart.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {

    @Autowired
    public List<Map<Object, String>> getLine2(Map<Object, String> params) throws Exception {
        return  getLine2(params);
    }
//    @Autowired
//    public HashMap<String, Object> selectTest(Map<String, Object> params)  throws Exception {
//        return selectTest(params);
//    }

}
