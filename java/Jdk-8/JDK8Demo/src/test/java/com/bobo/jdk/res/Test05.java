package com.bobo.jdk.res;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Test05 {

    /**
     * 使用Fork/Join计算1-10000的和，
     * 当一个任务的计算数量大于3000的时候拆分任务。
     * 数量小于3000的时候就计算
     * @param args
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        SumRecursiveTask task = new SumRecursiveTask(1,10000l);
        Long result = pool.invoke(task);
        System.out.println("result="+result);
        long end = System.currentTimeMillis();
        System.out.println("总的耗时:" + (end-start));

    }
}

class SumRecursiveTask extends RecursiveTask<Long>{

    // 定义一个拆分的临界值
    private static final long THRESHOLD = 3000l;

    private final long start;

    private final long end;

    public SumRecursiveTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end -start;
        if(length <= THRESHOLD){
            // 任务不用拆分，可以计算
            long sum = 0;
            for(long i=start ; i <= end ;i++){
                sum += i;
            }
            System.out.println("计算："+ start+"-->" + end +",的结果为：" + sum);
            return sum;
        }else{
            // 数量大于预定的数量，那说明任务还需要继续拆分
            long middle = (start+end)/2;
            System.out.println("拆分:左边 " + start+"-->" + middle+", 右边" + (middle+1) + "-->" + end);
            SumRecursiveTask left = new SumRecursiveTask(start, middle);
            left.fork();
            SumRecursiveTask right = new SumRecursiveTask(middle + 1, end);
            right.fork();
            return left.join()+right.join();
        }
    }
}
