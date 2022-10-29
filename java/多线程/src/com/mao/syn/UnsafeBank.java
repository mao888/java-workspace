package com.mao.syn;

/**
 * @ClassName UnsafeBank
 * @Description TODO
 * @Author Huchao
 * @Date 2021/11/10 20:33
 * @Version 1.0
 **/
// 不安全的取钱
// 两个人去银行取钱，账户
public class UnsafeBank {
    public static void main(String[] args) {
        // 账户
        final Account account = new Account(100, "结婚基金");
        final Drawing you = new Drawing(account, 50, "胡超");
        final Drawing girlfriend = new Drawing(account, 100, "胡超的女人");
        you.start();
        girlfriend.start();
    }

}
//账户
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

}

// 银行：模拟取款
class Drawing extends Thread{

    Account account;    // 账户
    // 取了多少钱
    int drawingMoney;
    // 现在手里有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        // 判断有没有钱
        if (account.money-drawingMoney<0){
            System.out.println(Thread.currentThread().getName()+":钱不够，取不了");
            return;
        }
        // sleep 可以放大问题的发生性
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 卡内余额=余额-你取的钱
        account.money=account.money-drawingMoney;
        // 你手里的钱
        nowMoney=nowMoney+drawingMoney;
        // Thread.currentThread().getName() = this.getName()
        System.out.println(account.name+"余额为:"+account.money);
        System.out.println(this.getName()+"手里的钱："+nowMoney);
    }
}