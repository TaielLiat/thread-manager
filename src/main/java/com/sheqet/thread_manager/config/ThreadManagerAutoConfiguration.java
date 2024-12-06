package com.sheqet.thread_manager.config;

import com.sheqet.thread_manager.service.ThreadService;
import com.sheqet.thread_manager.controller.ThreadController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Configuration
public class ThreadManagerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ThreadService threadService() {
        return new ThreadService();
    }

    @Bean
    @ConditionalOnMissingBean
    public ThreadController threadController(ThreadService threadService) {
        return new ThreadController(threadService);
    }
}
