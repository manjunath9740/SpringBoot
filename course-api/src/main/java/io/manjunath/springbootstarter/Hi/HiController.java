package io.manjunath.springbootstarter.Hi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @RequestMapping("/hi")
	public String sayHello() {
		return "Hello";
	}
}
