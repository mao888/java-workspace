package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * 敌人类
 * @author 王贺祥
 *
 */
 class Enemy extends FlyingObject {
	int xSpeed;
	int life;
	int bulletNum;
    int time =20;
    int Time = time;
    int enemy_type;
	ImageIcon enemy1  = new ImageIcon("image/enemy1.png");
	ImageIcon enemy2  = new ImageIcon("image/enemy2.png");
	ImageIcon enemy3  = new ImageIcon("image/enemy3.png");
	ImageIcon enemy4  = new ImageIcon("image/enemy4.png");
	ImageIcon boom1  = new ImageIcon("image/boom1.png");
/**
 * 
 * @param enemy_x 初始化敌人的横坐标
 * @param enemy_y 初始化敌人的纵坐标
 * @param life 敌人血量
 * @param enemy_type 敌人类型
 */
	 Enemy(int enemy_x,int enemy_y,int life,int enemy_type) { 
		this.x=enemy_x;
		this.y=enemy_y;
		this.life = life;
		this.enemy_type = enemy_type;
	}
	 /**
	  * 画敌机的方法，类型不同，画的敌机不同
	  * @param g  画笔对象
	  */
	 void drawenemy(Graphics g) {  
		 if(time==Time) {
			 switch(enemy_type)
			 {
			 case 1:    g.drawImage(enemy1.getImage(), x,y,50,35,null);   break;
			 case 2:    g.drawImage(enemy2.getImage(), x,y,50,35,null);   break;
			 case 3:    g.drawImage(enemy3.getImage(), x,y,50,35,null);   break;
			 case 4:    g.drawImage(enemy4.getImage(), x,y,50,35,null);   break;
			 }
		 }
		 else  		g.drawImage(boom1.getImage(), x,y,35,35,null);
	    enemy_move();
	}
	 /**
	  * 获得敌机所在的矩形
	  * @return  返回敌机所在的矩形边框
	  */
	 Rectangle enemySize() {       
			return new Rectangle(x, y,50,35);
	}
	 /**
	  * 敌机移动方法
	  */
	 void enemy_move() {   
		y+=2;
		x+=xSpeed;
		if(x<20) {
			xSpeed=3;
		}
		if(x>550) {
			xSpeed=-3;
		}
	}
	
}


//在敌机里面添加一个爆炸图片，添加一个画爆炸图片的方法，我的子弹打敌机时调用此方法，，其他动画类比



