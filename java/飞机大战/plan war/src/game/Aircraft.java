package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 * 我的飞机类
 * @author 王贺祥
 *
 */
class Aircraft extends FlyingObject{

	int life=20;
	final int Life = life;
	boolean dir_up, dir_down , dir_left , dir_right;
	ImageIcon aircraft  = new ImageIcon("image/aircraft.png");
	ImageIcon myblood  = new ImageIcon("image/myblood.png");     //添加我的飞机血量图片
	ImageIcon mybloodRim  = new ImageIcon("image/bloodRim.png");   //添加我的飞机血量轮廓
	ImageIcon bullet6icon  = new ImageIcon("image/bullet6icon.png");
	/**
	 * 
	 * @param aircraft_x 我的飞机初始x坐标
	 * @param aircraft_y 我的飞机初始y坐标
	 */
	public Aircraft(int aircraft_x,int aircraft_y) {
		super.x = aircraft_x;
		super.y = aircraft_y;
		setSpeed(5);
		setWidth(65);
		setHeight(45);
	}
	/**
	 * 画我的飞机、我的飞机的血量条、我的飞机的血量条边框游戏界面左上角的超级道具图标
	 * @param g
	 */
	void drawaircraft(Graphics g) {
		g.drawImage(aircraft.getImage(), x,y , width, height, null);
		g.drawImage(myblood.getImage(), 95,30,(int)(80*((float)life/Life)),12, null);   //血量条宽度随血量减小而减小
		g.drawImage(mybloodRim.getImage(), 95,30,80,12, null);         //血量轮廓不变
		g.drawImage(bullet6icon.getImage(), 22,51,18,18, null); 
		aircraftmove();
	}
	/**
	 * 获得我的飞机所在的矩形
	 * @return 返回我的飞机所在的矩形
	 */
	Rectangle aircraftSize() {
		return new Rectangle(x,y+7 ,60, 45);      //得到我的飞机所在的矩形，为了实现碰撞
	}
	/**
	 * 飞机的移动
	 */
	void aircraftmove() {
		//飞机移动    设置飞机移动的边界//

		if(dir_up) {
			if(this.y>0) {      
				this.y -= speed;   
			}
		}
		if(dir_down) {
			if(this.y<564) {    
				this.y += speed;
			}
		}
		if(dir_left) {
			if(this.x>0) {         
				this.x -= speed;
			}
		}
		if(dir_right) {
			if(this.x<520) {             
				this.x += speed;
			}
		}
	}

}



