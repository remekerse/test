package com.hd.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Value("${params.one}")
    private String one;
    @Value("${params.two}")
    private String two;
    @Value("${params.three}")
    private String three;
    @Value("${params.four}")
    private String four;

    @RequestMapping("check")
    public String check(){
        return "success"+one+"----"+two+"----"+three+"----"+four;
    }

    @RequestMapping("directBufferOOM")
    public String directBufferOOM(){
        return "directBufferOOM";
    }

    @RequestMapping("stopWorldTest")
    public String stopWorldTest(){
        return "stopWorldTest";
    }

}
