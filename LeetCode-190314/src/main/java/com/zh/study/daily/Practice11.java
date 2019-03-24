package com.zh.study.daily;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @auther zh
 * @data 2019/3/23 20:50
 */

public class Practice11 implements Lock {

   static class Sync extends AbstractQueuedSynchronizer{
       @Override
       protected boolean tryAcquire(int arg) {
           if (arg != 1){
               throw new RuntimeException("single is not 1");
           }
           if (compareAndSetState(0,1)){
               setExclusiveOwnerThread(Thread.currentThread());
               return true;
           }
           return false;
       }

       @Override
       protected boolean tryRelease(int arg) {
           if (arg == 0){
               throw  new IllegalMonitorStateException();
           }
               setExclusiveOwnerThread(null);
                setState(0);
                return true;
       }

       @Override
       protected boolean isHeldExclusively() {
           return getState()== 1;
       }
   }
    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
