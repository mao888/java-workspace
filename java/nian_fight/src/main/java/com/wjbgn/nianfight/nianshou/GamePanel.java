package com.wjbgn.nianfight.nianshou;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.wjbgn.nianfight.nianshou.InitProcessor.*;


class GamePanel extends JPanel implements KeyListener, ActionListener {

    /**
     * 定时器
     */
    private Timer timer = new Timer(15, this);


    /**
     * description: 定时器回调位置
     * @param e
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 15:38
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // 当前年兽向右移动的情况
        if (InitProcessor.LEFT.equals(InitProcessor.moveDirection)) {
            // 被击中，换方向
            if (InitProcessor.hit) {
                InitProcessor.moveDirection = InitProcessor.RIGHT;
            }
            // 判断移动到边界
            if (InitProcessor.nian_x > 30) {
                InitProcessor.nian_x -= InitProcessor.moveSpeed * 2;
            } else {
                InitProcessor.moveDirection = InitProcessor.RIGHT;
                InitProcessor.nian_x += InitProcessor.moveSpeed * 2;
            }

        } else {
            // 被击中，换方向
            if (InitProcessor.hit) {
                InitProcessor.moveDirection = InitProcessor.LEFT;
            }
            // 当前年兽向左移动的情况
            // 判断移动到边界
            if (InitProcessor.nian_x < 640) {
                InitProcessor.nian_x += InitProcessor.moveSpeed * 2;
            } else {
                InitProcessor.moveDirection = InitProcessor.LEFT;
                InitProcessor.nian_x -= InitProcessor.moveSpeed * 2;
            }
        }

        // 礼花掉落轨迹
        if (InitProcessor.showFireworks) {
            InitProcessor.fireworks_y += 8 * InitProcessor.moveSpeed;
            InitProcessor.fireworks_x = InitProcessor.nian_x;
            // 如果被老虎接住
            if (InitProcessor.fireworks_x > InitProcessor.tiger_x && InitProcessor.fireworks_x < InitProcessor.tiger_x + 80
                    && InitProcessor.fireworks_y > InitProcessor.tiger_y && InitProcessor.fireworks_y < InitProcessor.tiger_y + 90) {
                InitProcessor.showFireworks = false;
                InitProcessor.fireworks_x = 0;
                InitProcessor.fireworks_y = InitProcessor.nian_y + 200;
                InitProcessor.currentFireworks = null;

                // 更换礼花背景
                InitProcessor.takeFireworks = true;

            } else if (InitProcessor.fireworks_y > InitProcessor.tiger_y + 100) {
                InitProcessor.showFireworks = false;
                InitProcessor.fireworks_x = 0;
                InitProcessor.fireworks_y = InitProcessor.nian_y + 200;
                InitProcessor.currentFireworks = null;
            }
        }

        // 炸弹掉落轨迹
        if (showYouWillBeKill) {
            youWillBeKill_y += 8 * InitProcessor.moveSpeed;
            youWillBeKill_x = InitProcessor.nian_x;
            // 如果被老虎接住
            if (youWillBeKill_x > InitProcessor.tiger_x && youWillBeKill_x < InitProcessor.tiger_x + 80
                    && youWillBeKill_y > InitProcessor.tiger_y && youWillBeKill_y < InitProcessor.tiger_y + 90) {
                showYouWillBeKill = false;
                youWillBeKill_x = 0;
                youWillBeKill_y = InitProcessor.nian_y + 200;
                youWillBeKill = 0;

                // 你被炸死了
                isGameOver = true;

            } else if (youWillBeKill_y > InitProcessor.tiger_y + 100) {
                showYouWillBeKill = false;
                youWillBeKill_x = 0;
                youWillBeKill_y = InitProcessor.nian_y + 200;
                youWillBeKill = 0;
            }
        }

        // 如果玩家正在攻击
        if (InitProcessor.attack) {
            //达到子弹y轴边界，重置子弹位置
            if (InitProcessor.bullet_y < 100) {
                InitProcessor.hit = false;
                InitProcessor.attack = false;
                InitProcessor.bullet_y = InitProcessor.tiger_y - 20;
                InitProcessor.bullet_x = InitProcessor.tiger_x + 20;
            } else {
                // 击中年兽，在年兽当前x/y轴范围之内
                if (InitProcessor.bullet_y < InitProcessor.nian_y + 180 && InitProcessor.bullet_x > InitProcessor.nian_x + 10 && InitProcessor.bullet_x < InitProcessor.nian_x + 190) {
                    // 击中次数自加1
                    InitProcessor.hitCount++;
                    // 重置子弹和攻击状态
                    InitProcessor.attack = false;
                    InitProcessor.bullet_y = InitProcessor.tiger_y - 20;
                    InitProcessor.bullet_x = InitProcessor.tiger_x + 30;
                    // 被击中出现烟花背景
                    InitProcessor.hit = true;
                    // 每击中10次掉一滴血，减少血量，共十滴血
                    if (InitProcessor.hitCount == 10) {
                        if (InitProcessor.nianBlood == 0) {
                            //击败年兽，游戏结束
                            InitProcessor.success = true;
                        } else {
                            //血量减一
                            InitProcessor.nianBlood--;
                            if (InitProcessor.nianBlood == 0) {
                                //击败年兽，游戏结束
                                InitProcessor.success = true;
                            }
                            // 被攻击10次掉落随机礼花
                            InitProcessor.showFireworks = true;
//                            repaint();
                        }
                        InitProcessor.hitCount = 0;
                    }
                    // 被攻击6次掉落炸弹
                    youWillBeKill++;
                    if (youWillBeKill >= 3) {
                        showYouWillBeKill = true;
                    }
                }
                //子弹移动速度
                InitProcessor.bullet_y -= InitProcessor.moveSpeed * 12;
            }
        }
        //设置烟火的展示时间，定时器刷新50次，不准确，但是至少能明显感受到烟花存在
        if (InitProcessor.hitShow == 50) {
            InitProcessor.hit = false;
            InitProcessor.hitShow = 0;
        }
        // 自增展示次数
        InitProcessor.hitShow++;
        // 刷新页面
        repaint();
        timer.start();//启动计时器
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    /**
     * description: 键盘按下未释放
     *
     * @param e
     * @return: void
     * @author: weirx
     * @time: 2022/1/10 14:02
     */
    @SneakyThrows
    @Override
    public void keyPressed(KeyEvent e) {
        // 添加按钮下压事件到set
        InitProcessor.keys.add(e.getKeyCode());
        // 遍历执行按钮事件
        multiKeys();
    }

    /**
     * description: 判断游戏暂停状态，通过定时器暂停控制
     *
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 10:54
     */
    private void isStopped() {
        if (InitProcessor.isStopped) {
            // 继续游戏
            timer.start();
            InitProcessor.isStopped = false;
        } else {
            // 暂停游戏
            timer.stop();
            InitProcessor.isStopped = true;
        }
    }

    /**
     * description: 释放按键
     * @param e
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 15:39
     */
    @Override
    public void keyReleased(KeyEvent e) {
        //按钮释放，则将该事件移除
        InitProcessor.keys.remove(e.getKeyCode());
    }

    /**
     * description: 遍历执行按键事件
     *
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 10:55
     */
    public void multiKeys() {
        for (Integer key : InitProcessor.keys) {
            int keyCode = key;
            //空格键
            if (keyCode == KeyEvent.VK_SPACE) {
                if (InitProcessor.success || isGameOver) {
                    //重新开始
                    InitProcessor.init();
                    repaint();
                    break;
                }
                // 游戏未开始
                if (!InitProcessor.isStared) {
                    // 开始游戏
                    InitProcessor.isStared = true;
                    repaint();
                } else {
                    isStopped();
                }
            }
            //游戏未暂停
            if (!InitProcessor.isStopped) {
                // 方向右键
                if (keyCode == KeyEvent.VK_RIGHT) {
                    if (InitProcessor.tiger_x < 750) {
                        InitProcessor.tiger_x += InitProcessor.moveSpeed * 10;
                    }
                }
                // 方向左键
                else if (keyCode == KeyEvent.VK_LEFT) {
                    if (InitProcessor.tiger_x > 26) {
                        InitProcessor.tiger_x -= InitProcessor.moveSpeed * 10;
                    }
                    // 攻击
                } else if (keyCode == KeyEvent.VK_S) {
                    InitProcessor.attack = true;
                }
            }
        }
        //重新绘制
        repaint();
    }

    /**
     * description: 画页面
     *
     * @param g
     * @return: void
     * @author: weirx
     * @time: 2022/1/10 13:40
     */
    @Override
    protected void paintComponent(Graphics g) {
        // 清屏效果
        super.paintComponent(g);
        // 游戏未开始
        if (!InitProcessor.isStared) {
            background.paintIcon(this, g,0,0);
            InitProcessor.nian.paintIcon(this, g, 250, 130);
            InitProcessor.tiger.paintIcon(this, g, 220, 470);
            // 绘制首页
            // 设置游戏文字
            g.setColor(Color.ORANGE);
            g.setFont(new Font("幼圆", Font.BOLD, 50));
            g.drawString("年兽大作战", 325, 550);
            // 设置开始提示
            g.setColor(Color.GREEN);
            g.setFont(new Font("幼圆", Font.BOLD, 30));
            g.drawString("按【空格】键开始游戏", 300, 620);
            g.drawString("按【←】【→】键移动", 300, 660);
            g.drawString("按【S】键发射炮弹", 300, 700);
        } else if (isGameOver) {
            //输出gameover
            InitProcessor.gameOver.paintIcon(this, g, 10, 10);
            // 设置开始提示
            g.setColor(Color.GREEN);
            g.setFont(new Font("幼圆", Font.BOLD, 20));
            g.drawString("按【空格】再次开始游戏", 340, 600);
        }
        //绘制游戏区域
        else {
            // 年兽未击败
            if (!InitProcessor.success) {

                background.paintIcon(this, g,0,0);
                //绘制年兽血量
                g.setColor(Color.GREEN);
                g.setFont(new Font("幼圆", Font.BOLD, 20));
                g.drawString("NIAN'S HP:", 50, 35);
                for (int i = 0; i < InitProcessor.nianBlood; i++) {
                    InitProcessor.heart.paintIcon(this, g, 170 + 50 * i, 5);
                }

                if (InitProcessor.hit) {
                    // 初始时候没有拿到指定烟火
                    if (currentFlowers == null) {
                        currentFlowers = InitProcessor.flowers;
                    }
                    // 持有怪兽掉落烟火
                    if (takeFireworks) {
                        int i = RandomUtil.randomInt(1, 11);
                        currentFlowers = InitProcessor.flowersDOS.get(i).getFlower();
                        // 还原持有烟火标志位
                        takeFireworks = false;
                    }
                    currentFlowers.paintIcon(this, g, 170, 180);
                }
                // 绘制年兽
                InitProcessor.nianSmall.paintIcon(this, g, InitProcessor.nian_x, InitProcessor.nian_y);
                // 绘制玩家老虎
                InitProcessor.tiger.paintIcon(this, g, InitProcessor.tiger_x, InitProcessor.tiger_y);
                // 如果击中年兽，绘制子弹
                if (InitProcessor.attack) {
                    InitProcessor.bullet.paintIcon(this, g, InitProcessor.bullet_x, InitProcessor.bullet_y);
                }
                // 两次要释放一个炸弹
                if (youWillBeKill >= 3) {
                    youwillbekill.paintIcon(this, g, youWillBeKill_x, youWillBeKill_y);
                }
                // 如果击中次数为10，则掉落一个烟花,如果当前有正在掉落的则继续，否则随机一个
                if (InitProcessor.showFireworks) {
                    if (ObjectUtil.isEmpty(InitProcessor.currentFireworks)) {
                        int i = RandomUtil.randomInt(1, 11);
                        InitProcessor.currentFireworks = InitProcessor.fireworksDOS.get(i).getFirework();
                    }
                    InitProcessor.currentFireworks.paintIcon(this, g, InitProcessor.fireworks_x, InitProcessor.fireworks_y);
                }
            } else {
                // 年兽被击败，输出新年快乐礼花
                InitProcessor.happyNewYear.paintIcon(this, g, 0, 0);
                // 设置开始提示
                g.setColor(Color.GREEN);
                g.setFont(new Font("幼圆", Font.BOLD, 20));
                g.drawString("按【空格】再次开始游戏", 340, 550);
                //输出新年快乐礼花
                InitProcessor.happyNewYearCn.paintIcon(this, g, 100, 50);
            }
        }
    }

    /**
     * description: 无参构造，初始化
     *
     * @return:
     * @author: weirx
     * @time: 2022/1/10 13:36
     */
    public GamePanel() {
        // 获取焦点事件
        this.setFocusable(true);
        // 添加键盘监听事件
        this.addKeyListener(this);
        // 启动定时器
        timer.start();
    }

}