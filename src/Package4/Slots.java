package Package4;

public class Slots 
{
	private int id;
    private String name;
    private String stime;
    private String etime;
    private String duration;
    private String vehnum;
    
	public Slots(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getVehnum() {
		return vehnum;
	}
	public void setVehnum(String vehnum) {
		this.vehnum = vehnum;
	}
	
 

}
