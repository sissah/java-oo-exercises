package blogz;

import java.util.Date;

public class Post extends Entity{
	private String body,  title, author;
	private final Date created;
	private Date modified;
	
	public Post(String body, String title, String author, Date created, Date modified){
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
		this.modified = modified;
		
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getCreated() {
		return created;
	}
	
}
