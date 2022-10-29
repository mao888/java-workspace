package com.wjbgn.nianfight.nianshou;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description： 初始化处理器
 * @author：weirx
 * @date：2022/1/11 10:15
 * @version：3.0
 */
public class InitProcessor {

    /**
     * 游戏是否开始，默认是false
     */
    public static Boolean isStared = false;

    /**
     * 游戏是否暂停，默认是false
     */
    public static Boolean isStopped = false;

    /**
     * 射击标记，默认是false
     */
    public static Boolean attack = false;

    /**
     * 年兽初始位置横坐标
     */
    public static int nian_x = 325;

    /**
     * 年兽初始位置纵坐标
     */
    public static int nian_y = 50;

    /**
     * 年兽初始位置横坐标
     */
    public static int tiger_x = 325;

    /**
     * 年兽初始位置纵坐标
     */
    public static int tiger_y = 660;


    /**
     * 子弹横坐标
     */
    public static int bullet_x = tiger_x + 20;

    /**
     * 子弹纵坐标
     */
    public static int bullet_y = tiger_y - 20;

    /**
     * 礼花横坐标
     */
    public static int fireworks_x = 0;

    /**
     * 礼花纵坐标
     */
    public static int fireworks_y = nian_y + 200;

    /**
     * 展示礼花
     */
    public static Boolean showFireworks = false;

    /**
     * 正在掉落的礼花
     */
    public static ImageIcon currentFireworks = null;

    /**
     * 年兽移动速度
     */
    public static int moveSpeed = 1;

    /**
     * 右
     */
    public final static String RIGHT = "right";

    /**
     * 左
     */
    public final static String LEFT = "left";


    /**
     * 当前位置
     */
    public static String moveDirection = LEFT;

    /**
     * 是否击中年兽
     */
    public static Boolean hit = false;

    /**
     * 击中次数
     */
    public static int hitCount = 0;

    /**
     * 烟花展示次数
     */
    public static int hitShow = 0;

    /**
     * 年兽有10滴血
     */
    public static int nianBlood = 10;


    /**
     * 成功击败年兽
     */
    public static Boolean success = false;


    static Set<Integer> keys = new HashSet<>();

    /**
     * 持有礼花了
     */
    public static Boolean takeFireworks = false;

    /**
     * 当前礼花样式
     */
    public static ImageIcon currentFlowers = null;

    /**
     * 年兽释放炸弹标记
     */
    public static int youWillBeKill = 0;

    /**
     * 礼花横坐标
     */
    public static int youWillBeKill_x = 0;

    /**
     * 礼花纵坐标
     */
    public static int youWillBeKill_y = nian_y + 200;


    /**
     * 展示炮弹
     */
    public static Boolean showYouWillBeKill = false;

    public static Boolean isGameOver = false;

    /**
     * 图片路径
     */
    public final static String PATH_PREFIX = "src/main/java/com/wjbgn/nianfight/pic/";


    public static ImageIcon nian = new ImageIcon(PATH_PREFIX + "nian.png");

    public static ImageIcon tiger = new ImageIcon(PATH_PREFIX + "tiger\\tiger2.png");

    public static ImageIcon heart = new ImageIcon(PATH_PREFIX + "blood\\heart.png");

    public static ImageIcon flowers = new ImageIcon(PATH_PREFIX + "flowers\\bullet.png");

    public static ImageIcon nianSmall = new ImageIcon(PATH_PREFIX + "nian_small.png");

    public static ImageIcon bullet = new ImageIcon(PATH_PREFIX + "body.png");

    public static ImageIcon happyNewYear = new ImageIcon(PATH_PREFIX + "flowers\\happynewyear.png");

    public static ImageIcon happyNewYearCn = new ImageIcon(PATH_PREFIX + "happyneryearcn.png");

    public static ImageIcon youwillbekill = new ImageIcon(PATH_PREFIX + "fireworks\\youwillbekill.png");

    public static ImageIcon gameOver = new ImageIcon(PATH_PREFIX + "gameover.png");

    public static ImageIcon background = new ImageIcon(PATH_PREFIX + "background.png");
    /**
     * 礼花容器
     */
    public static List<FireworksDO> fireworksDOS = initFireworks();

    /**
     * 花容器
     */
    public static List<FlowersDO> flowersDOS = initFlowers();

    private static List<FlowersDO> initFlowers() {
        List<FlowersDO> list = new ArrayList<>();
        list.add(new FlowersDO(1, PATH_PREFIX + "flowers\\flower1.png"));
        list.add(new FlowersDO(2, PATH_PREFIX + "fireworks\\flower2.png"));
        list.add(new FlowersDO(3, PATH_PREFIX + "fireworks\\flower3.png"));
        list.add(new FlowersDO(4, PATH_PREFIX + "fireworks\\flower4.png"));
        list.add(new FlowersDO(5, PATH_PREFIX + "fireworks\\flower5.png"));
        list.add(new FlowersDO(6, PATH_PREFIX + "fireworks\\flower6.png"));
        list.add(new FlowersDO(7, PATH_PREFIX + "fireworks\\flower7.png"));
        list.add(new FlowersDO(8, PATH_PREFIX + "fireworks\\flower8.png"));
        list.add(new FlowersDO(9, PATH_PREFIX + "fireworks\\flower9.png"));
        list.add(new FlowersDO(10, PATH_PREFIX + "fireworks\\flower10.png"));
        list.add(new FlowersDO(11, PATH_PREFIX + "fireworks\\flower11.png"));
        return list;
    }


    /**
     * description: 初始化礼花种类
     *
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 10:58
     */
    public static List<FireworksDO> initFireworks() {
        List<FireworksDO> list = new ArrayList<>();
        list.add(new FireworksDO(1, PATH_PREFIX + "fireworks\\fireworks1.png"));
        list.add(new FireworksDO(2, PATH_PREFIX + "fireworks\\fireworks2.png"));
        list.add(new FireworksDO(3, PATH_PREFIX + "fireworks\\fireworks3.png"));
        list.add(new FireworksDO(4, PATH_PREFIX + "fireworks\\fireworks4.png"));
        list.add(new FireworksDO(5, PATH_PREFIX + "fireworks\\fireworks5.png"));
        list.add(new FireworksDO(6, PATH_PREFIX + "fireworks\\fireworks6.png"));
        list.add(new FireworksDO(7, PATH_PREFIX + "fireworks\\fireworks7.png"));
        list.add(new FireworksDO(8, PATH_PREFIX + "fireworks\\fireworks8.png"));
        list.add(new FireworksDO(9, PATH_PREFIX + "fireworks\\fireworks9.png"));
        list.add(new FireworksDO(10, PATH_PREFIX + "fireworks\\fireworks10.png"));
        list.add(new FireworksDO(11, PATH_PREFIX + "fireworks\\fireworks11.png"));
        return list;
    }


    /**
     * description: 初始化
     *
     * @return: void
     * @author: weirx
     * @time: 2022/1/11 10:39
     */
    public static void init() {
        isStared = false;
        isStopped = false;
        attack = false;
        nian_x = 325;
        nian_y = 50;
        tiger_x = 325;
        tiger_y = 660;
        bullet_x = tiger_x + 20;
        bullet_y = tiger_y - 20;
        moveSpeed = 1;
        moveDirection = LEFT;
        hit = false;
        hitCount = 0;
        hitShow = 0;
        nianBlood = 10;
        success = false;
        keys = new HashSet<>();
        fireworks_x = 0;
        fireworks_y = nian_y + 200;
        showFireworks = false;
        currentFireworks = null;
        takeFireworks = false;
        currentFlowers = null;
        youWillBeKill = 0;
        youWillBeKill_x = 0;
        youWillBeKill_y = nian_y + 200;
        showYouWillBeKill = false;
        isGameOver = false;
    }
}
