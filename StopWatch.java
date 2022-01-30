package com.Bridgelabz;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;


    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        
        long elapsed;
        
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            System.out.println("Start-time is: " +startTime);
            System.out.println("Stop-time is : " +stopTime);
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    public static void main(String[] args) {

        StopWatch s = new StopWatch();
        s.start();

        for(int hours = 0; hours < 1; hours++)
        {
            for(int minutes = 0; minutes < 1; minutes++)
            {
                for(int seconds = 0; seconds < 60; seconds++)
                {
                    for(int ms = 0; ms < 1000; ms++)
                    {
                        System.out.println(hours + ":" + minutes + ":" + seconds + "." + ms);
                    }
                }
            }
        }
        
        s.stop();
        System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
    }
}