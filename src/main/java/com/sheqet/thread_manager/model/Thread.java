package com.sheqet.thread_manager.model;

import java.util.List;

public class Thread {
    private List<String> busyThreads;

    public Thread(List<String> busyThreads) {
        this.busyThreads = busyThreads;
    }

    public List<String> getBusyThreads() {
        return busyThreads;
    }
}
