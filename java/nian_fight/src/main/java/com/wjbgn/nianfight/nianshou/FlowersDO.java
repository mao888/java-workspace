package com.wjbgn.nianfight.nianshou;

import javax.swing.*;

import static com.wjbgn.nianfight.nianshou.InitProcessor.PATH_PREFIX;

/**
 * @description： 花容器
 * @author：weirx
 * @date：2022/1/11 11:05
 * @version：3.0
 */
public class FlowersDO {

    private Integer id;

    private String path;

    private ImageIcon flower;

    public ImageIcon getFlower() {
        return flower;
    }

    public void setFlower(ImageIcon flower) {
        this.flower = flower;
    }

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

    public FlowersDO(Integer id, String path) {
        this.id = id;
        this.path = path;
        this.flower = new ImageIcon(PATH_PREFIX + "flowers\\flower" + id + ".png");
    }
}
