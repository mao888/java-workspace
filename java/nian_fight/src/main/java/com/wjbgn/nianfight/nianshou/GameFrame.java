package com.wjbgn.nianfight.nianshou;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @description： main方法
 * @author：weirx
 * @date：2022/1/10 13:34
 * @version：3.0
 */
public class GameFrame {

    public static void main(String[] args) {
        //1.创建窗口对象
        Frame frame = new Frame("年兽大作战");
        // 设置窗体大小为900x800
        frame.setSize(900, 800);
        // 设置窗体为居中格式
        frame.setLocationRelativeTo(null);
        // 设置窗体不可改变
        frame.setResizable(false);
        // 在窗体中添加一个面板
        frame.add(new GamePanel());
        // 设置窗体可见
        frame.setVisible(true);

        // 窗口点击关闭
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                System.exit(0);
            }
        });
    }
}
