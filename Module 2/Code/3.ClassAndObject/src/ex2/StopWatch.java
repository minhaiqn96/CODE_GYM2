package ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public void selectionSort(List array) {
        Collections.sort(array);
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        List<String> list = new ArrayList<>(5);
        list.add("Hai");
        list.add("Quoc");
        list.add("Tuan");
        list.add("Thang");
        list.add("Toan");

        stopWatch.start();
        stopWatch.selectionSort(list);
        stopWatch.end();
        System.out.println("Program execution time: " + stopWatch.getElapsedTime());
    }
}
