package ex01_bean.ex02_setter;

public class Sample {

	String msg="default message";
	
	public  Sample()
	{
		System.out.println("instantiate.. step 1");
	}
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("DI.. step 2");
	}
	
	
	public void init()
	{
		System.out.println("this is for initialization - step no 8");
	}
	
}
