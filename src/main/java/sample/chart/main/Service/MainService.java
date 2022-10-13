package sample.chart.main.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MainService {

    public List<HashMap<Object, String>> getLine2(HashMap<Object,String> params) throws Exception{
        return getLine2((params));
    }



}
