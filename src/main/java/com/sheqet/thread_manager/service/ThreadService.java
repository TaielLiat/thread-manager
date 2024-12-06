package com.sheqet.thread_manager.service;

import com.sheqet.thread_manager.model.Thread;
import java.lang.management.*;
import java.util.*;


public class ThreadService {

    public Thread collectThreadData() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);

        List<String> busyThreads = new ArrayList<>();
        for (ThreadInfo info : threadInfos) {
            if (info != null && info.getThreadState() == java.lang.Thread.State.RUNNABLE) {
                busyThreads.add("ID: " + info.getThreadId() + ", Name: " + info.getThreadName());
            }
        }
        return new Thread(busyThreads);
    }
}
