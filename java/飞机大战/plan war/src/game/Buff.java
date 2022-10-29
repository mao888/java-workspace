package game;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
class Buff extends FlyingObject{
	int buffType;      //buff类型
	int buffSpeed_X;     //buff在X轴移动的速度
	//添加几种buff图标
	ImageIcon buff1 = new ImageIcon("image/buff1.png");
	ImageIcon buff2 = new ImageIcon("image/buff2.png");
	ImageIcon buff3 = new ImageIcon("image/buff3.png");
	ImageIcon buff4 = new ImageIcon("image/buff4.png");
	ImageIcon buff5 = new ImageIcon("image/buff5.png");
	ImageIcon buff6 = new ImageIcon("image/buff6.png");

	Buff(int buff_x,int buff_y,int buffType) {    //初始化buff对象时 传入buff生成位置和buff类型
		this.x = buff_x;
		this.y = buff_y;
		this.buffType = buffType;
	}
	void drawBuff(Graphics g) {
		//根据初始化时buff的类型来选择画哪种buff图片
		if(buffType == 1) 
			g.drawImage(buff1.getImage(), x, y,40,30, null);
		if(buffType == 2)
			g.drawImage(buff2.getImage(), x, y,40,30, null);
		if(buffType == 3)
			g.drawImage(buff3.getImage(), x, y,30,30,null);
		if(buffType == 4)
			g.drawImage(buff4.getImage(), x, y,40,30,null);
		if(buffType == 5)
			g.drawImage(buff5.getImage(), x, y,40,30,null);
		if(buffType == 6)
			g.drawImage(buff6.getImage(), x, y,40,30,null);
		buffMove();
	}
	/**
	 * 不同的buff所在的矩形边界不同
	 * @return 返回子弹所在的范围
	 */
	Rectangle buffSize() {
		if(buffType == 1||buffType == 2||buffType == 4||buffType == 5||buffType == 6) {
			return new Rectangle(x, y,40,30);
		}else  {
			return new Rectangle(x, y,30,30);
		}
	}
	/**
	 * buff的移动方法
	 */
	void buffMove() { 
		y++;
		x+=-buffSpeed_X;
		if(x>400) {
			buffSpeed_X=5;
		}else if(x<100){
			buffSpeed_X=-5;
		}
	}
}
