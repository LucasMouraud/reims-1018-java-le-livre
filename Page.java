public class Page{

	private int id;
	private String content;
	private Array nextPages;

	public Page(int id, String content, Array nextPages){
		this.id = id;
		this.content = content;
		this.nextPages = nextPages;
	}

	public int getId(){
		return this.id;
	}

	public void setId(){
		this.id = id;
	}

	public String getContent(){
		return this.content;
	}

	public void setContent(){
		this.content = content;
	}

	public int getArray(){
		return this.array;
	}

	public void setArray(){
		this.array = array;
	}
}