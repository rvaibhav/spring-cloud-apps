package org.test.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.demo.example.inheritence.ChildStrategy;


import java.util.Map;

@Controller
public class HelloController {
    
    @Autowired
    private ChildStrategy childStrategy;
    
    @RequestMapping("/hi/{name}")
    public String hiThere(Map model, @PathVariable("name") String name) {
        model.put("name", name);
        childStrategy.functionOne();
        return "hello";
    }

}
