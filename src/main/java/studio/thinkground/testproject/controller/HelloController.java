package studio.thinkground.testproject.controller;

import org.springframework.web.bind.annotation.*;
import studio.thinkground.testproject.dto.MemberDTO;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

}
