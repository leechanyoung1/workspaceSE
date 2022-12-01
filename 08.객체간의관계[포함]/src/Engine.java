
public class Engine {
	private String type;//차량엔진
	private int cc;//엔진배기량
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	public Engine(String type, int cc) {
		
		this.type = type;
		this.cc = cc;
	}
	public void print() {
		System.out.println(this.type+"\t"+this.cc);
	}
	
	
	public String getType() {
		return type;
	}
	public int getCc() {
		return cc;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
