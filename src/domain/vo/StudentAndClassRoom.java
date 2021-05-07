package domain.vo;

public class StudentAndClassRoom {
	private String sid;
	private String sname;
	private Integer sage;
	private String sadress;
	private String cid;
	private String cname;

	@Override
	public String toString() {
		return "StudentAndClassRoom{" +
				"sid='" + sid + '\'' +
				", sname='" + sname + '\'' +
				", sage=" + sage +
				", sadress='" + sadress + '\'' +
				", cid='" + cid + '\'' +
				", cname='" + cname + '\'' +
				'}';
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSadress() {
		return sadress;
	}

	public void setSadress(String sadress) {
		this.sadress = sadress;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
