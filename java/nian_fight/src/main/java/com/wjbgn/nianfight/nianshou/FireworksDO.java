package com.wjbgn.nianfight.nianshou;

import javax.swing.*;

import static com.wjbgn.nianfight.nianshou.InitProcessor.PATH_PREFIX;

/**
 * @description： 礼花实体类
 * @author：weirx
 * @date：2022/1/11 11:01
 * @version：3.0
 */
public class FireworksDO {

    /**
     * id
     */
    private Integer id;

    /**
     * 图片路径
     */
    private String path;

    public ImageIcon getFirework() {
        return firework;
    }

    public void setFirework(ImageIcon firework) {
        this.firework = firework;
    }

    private ImageIcon firework;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FireworksDO(Integer id, String path) {
        this.id = id;
        this.path = path;
        this.firework = new ImageIcon(PATH_PREFIX + "fireworks\\fireworks" + id + ".png");
    }
}
