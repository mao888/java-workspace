package 匿名内部类;

/*
 * 例2(继承类)
 * */
abstract class Device{
	
	private String name;
	public abstract double  getPrice();
	
	public String getName(){
	 	return name;
	}
	
	public Device(){}
	
	public Device(String name){
		this.name=name;
	}
	
} 

/* 
 * 定义一个实体类，实体类定义一个方法，
 * 方法的参数为上述的抽象类对象，到时候会传入一个匿名类对象，
 * 这个匿名类继承了上述创建的抽象类
 * */
class Anony1 {
    public void test(Device device){
        System.out.println("购买了一个"+device.getName()+"花费了"+device.getPrice());
    }
}

public class NiMing2 {
	public static void main(String[] args){
		Anony1 anony=new Anony1();
		// 注意，此处要传入一个匿名类对象
		anony.test(new Device("海尔电视机"){
			@Override
			public double getPrice(){
					return 578.6;
				}
		}
		);
	
		Device device=new Device(){
			@Override
			public double getPrice(){
				return 556.56;
			}
			@Override
			public String getName(){
				return "美的电视机";
			}
		};
		
		anony.test(device);
	}

}

	
	
	
	
	
	
	
	
	
	
	