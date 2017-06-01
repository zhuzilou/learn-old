package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Person bean
 *
 */
@Entity
@Table(name = "person", schema = "ssh2demo")
public class Person implements java.io.Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6630732977093256184L;
	private String pid;
	private String name;
	private int age;

	@Id
	@Column(name = "pid", unique = true, nullable = false, length = 40)
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age", nullable = false, length = 3)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
