package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * 我的子弹类
 * @author 王贺祥
 *
 */
class MyBullet extends FlyingObject{
	int aircraft_y;       //初始化子弹对象时 飞机所在的Y坐标
	int bulletType;
	int bigBulTim;
	int time;
	ImageIcon daodan  = new ImageIcon("image/bullet8.png");
	ImageIcon bullet1  = new ImageIcon("image/bullet7.png");
	ImageIcon paidan  = new ImageIcon("image/paidan.png");
	ImageIcon bullet2  = new ImageIcon("image/bullet1.png");
	/**
	 * 初始化我的子弹时传入我的飞机的坐标和子弹类型类型
	 * @param bullets_x    子弹的x轴坐标
	 * @param bullets_y     子弹的y轴坐标
	 * @param bulletType      子弹的类型
	 */
	MyBullet(int bullets_x,int bullets_y,int bulletType) { 
		this.x=bullets_x;
		this.y=bullets_y;
		this.aircraft_y = bullets_y;
		this.bulletType = bulletType;
	}
	/**
	 * 画笔方法
	 * 根据传入的子弹类型来画相应的子弹图片
	 * @param g
	 */
	void drawbullet(Graphics g) {
		//根据不同的子弹类型来选择画不同的子弹
		switch(bulletType) {
		case 1:
		case 2:
			g.drawImage(bullet1.getImage(), x+27, y+4, 7,14, null);
			break;
		case 3:
		case 4:
			g.drawImage(bullet2.getImage(), x+27, y+4, 10,25, null);
			break;
		case 5:
			g.drawImage(daodan.getImage(), x-30, y+4, 8,24, null);
			break;
		case 6:
			g.drawImage(daodan.getImage(), x+80, y+4, 8,24, null);
			break;
		case 7:
			g.drawImage(paidan.getImage(), 0, y-10, 600,5, null);
			break;
		}
		aircraftbulletmove()	;   //调用子弹移动方法
		time++;
	}
	/**
	 * 不同的子弹类型获得不同的子弹边界
	 * @return
	 */
	Rectangle bulletSize() {
		switch(bulletType)
		{
		case 1:
		case 2:
			return new Rectangle(x+27, y+4,7,14);
		case 3:
		case 4:
			return new Rectangle(x+27, y+4,10,25);
		case 5:
			return new Rectangle(x-30,  y+4,8,24);
		case 6:
			return new Rectangle(x+80,  y+4,8,24);
		case 7:
			return new Rectangle(0, y, 600,5);
		}
		return null;
	}
	/**
	 * 子弹移动方法，不同子弹移动轨迹不同
	 */
	void aircraftbulletmove() {     
		switch (bulletType)
		{
		case 1:
			y-=6;
			if(time%3==0) x--;
			break;
		case 2:
			y-=6;
			if(time%3==0) x++;
			break;
		case 3:
			x++;
			y-=6;
			break;
		case 4:
			x--;
			y-=6;
			break;
		case 5:
		case 6:
			y-=10;	
			break;
		case 7:
			y-=3;
		}
	}
}





