package game;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
/**
 * boss类
 * @author 王贺祥
 *
 */
class Boss extends FlyingObject{
	/** boss在水平方向的速度*/ 
	int xSpeed=1;
	/**boss生命值*/
	int life=300;
	/**boss初始生命值，在画血量条的时候用到*/
	final int Life = life;
	/**实例化boss对象后等待一段时间（time）后出现boss*/
	int time;       
	/**
	 * 初始化boss位置
	 */
	Boss(){
		setX(250);
		setY(-200);
		setWidth(80);
		setHeight(40);
	}
	ImageIcon boss  = new ImageIcon("image/boss.png");
	ImageIcon blood = new ImageIcon("image/bossblood.png");
	ImageIcon bloodRim = new ImageIcon("image/bloodRim.png");
	/**
	 * 画boss、画boss血条、画boss血条边界、调boss的移动方法
	 * @param g
	 */
	void drawboss1(Graphics g) {
		if(life>0) {
			if(time>100) { 
				g.drawImage(boss.getImage(), x-15,y,width,height,null);            
				g.drawImage(blood.getImage(), x-80,y-20,(int)(200*((float)life/Life)),10,null);  
				g.drawImage(bloodRim.getImage(), x-80,y-20,200,10,null);       
			}
			boss1_move();
			time++;
			if(time>900) time=200;
		}
	}
	/**
	 * 获得boss所在的矩形，为了实现碰撞检测
	 * @return 返回boss所在的矩形
	 */
	Rectangle bossSize() {         //获得boss所在的矩形，为了实现碰撞检测
		return new Rectangle(x, y,50,40);
	}
	/**
	 * boss的移动方法
	 */
	void boss1_move() {                        //boss移动
		if(y<30) y++;
		else if(y==30&&time>200&&time<600) {
			if(x>=500) xSpeed=-2;
			if(x<=10) xSpeed=2;
			x+=xSpeed;
		}else if(y==30&&time>=600&&time<900) {
		}

	}
}
