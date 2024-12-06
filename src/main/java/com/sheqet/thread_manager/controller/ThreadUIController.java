package com.sheqet.thread_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreadUIController {

    @GetMapping("/thread-ui")
    public String getThreadPage() {
        return "thread-ui";
    }
}
