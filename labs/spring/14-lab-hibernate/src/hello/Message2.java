package hello;

/**
 * 
 * @hibernate.class
 * table="MESSAGES"
 *
 */
public class Message2 {
private Long id;
private String text;
private int size;

public Message2()
{
	}

/**
 * 
 * @hibernate.id
 * generator-class="increment"
 * column="MESSAGE_ID"
 */

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


/**
 * 
 * @hibernate.property
 */
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public void setsize(int i) {
    size = i;
  }

  public int getsize() {
    return size;
  }


}
