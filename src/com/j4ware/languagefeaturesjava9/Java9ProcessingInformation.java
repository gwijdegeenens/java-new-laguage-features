package com.j4ware.languagefeaturesjava9;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class Java9ProcessingInformation {
    
    public static void main(String... args) {
        ProcessHandle self = ProcessHandle.current();
        long pid = self.pid();
        System.out.println("pid " + pid);
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> processArgs = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        System.out.println("processArgs " + processArgs);
        System.out.println("cmd " + cmd);
        System.out.println("startTime " + startTime);
        System.out.println("cpuUsage " + cpuUsage);
        
    }
}
