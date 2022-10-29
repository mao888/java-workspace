package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * 子弹类
 * @author 王贺祥
 *
 */
class EnemyBullet extends FlyingObject{
	int enemybulletType;
	/**控制敌人子弹在x轴的速度*/
	int a;
	ImageIcon enemybullet1 = new ImageIcon("image/bullet6.png");
	ImageIcon enemybullet2 = new ImageIcon("image/bullet3.png");
	ImageIcon enemybullet3 = new ImageIcon("image/bullet4.png");

	public EnemyBullet(int enemybullet_x,int enemybullet_y,int enemybulletType) {           //初始化敌人子弹对象时传入敌人坐标
		this.x = enemybullet_x;
		this.y = enemybullet_y;
		this.enemybulletType = enemybulletType;
	}
	/**
	 * 根据传入的子弹类型画敌机子弹
	 * @param g
	 */
	void drawenemy_bullet(Graphics g) {     
		switch(enemybulletType)
		{
		case 1: 
			g.drawImage(enemybullet1.getImage(), x+18, y+28,10,10, null);
			break;
		case 2:
			g.drawImage(enemybullet2.getImage(), x+18, y+28,10,25, null);
			break;
		case 3:
			g.drawImage(enemybullet3.getImage(), x+18, y+28,12,12, null);
			break;
		case 4:
			g.drawImage(enemybullet3.getImage(), x+18, y+28,12,12, null);
		}
		enemy_bulletmove();         //调用敌机移动方法
	}
	/**
	 * 获取敌人子弹所在的矩形
	 * @return  返回敌人子弹所在的矩形
	 */
	Rectangle enemyBulletSize() {   
		switch(enemybulletType)
		{
		case 1: 
			return new Rectangle(x+18, y+28,10,10);
		case 2:
			return new Rectangle(x+18, y+28,10,25);
		case 3: 
			return new Rectangle(x+18, y+28,12,12);
		case 4:
			return new Rectangle(x+18, y+28,12,12);
		}
		return null;
	}
	void enemy_bulletmove() {   //敌机移动方法
		switch(enemybulletType)
		{
		case 1:  
			y+=3;  
			
			break;
		case 2:
			if(y<100)  y+=3;
			else y+=15;
			break;
		case 3:
			y+=3;
			a++;
			if(a%3==0)   x-=1;
			break;
		case 4:
			y+=3;
			a++;
			if(a%3==0)   x+=1;
			break;
		}

	}
}






