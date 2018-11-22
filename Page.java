public class Page{

	private int id;
	private String content;

	public Page(int id, String content){
		this.id = id;
		this.content = content;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getContent(){
		return this.content;
	}

	public void setContent(String content){
		this.content = content;
	}
}

/*
Page p = new Page(1, "hello");
p.setId(23);
p.getId(); // 23
*/