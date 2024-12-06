package com.sheqet.thread_manager.controller;

import com.sheqet.thread_manager.service.ThreadService;
import com.sheqet.thread_manager.model.Thread;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/threads")
public class ThreadController {

    private final ThreadService threadService;

    public ThreadController(ThreadService threadService) {
        this.threadService = threadService;
    }

    @GetMapping
    public ResponseEntity<Thread> getThreadInfo() {
        Thread data = threadService.collectThreadData();
        return ResponseEntity.ok(data);
    }
}
