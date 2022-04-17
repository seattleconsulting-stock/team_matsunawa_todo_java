package sample;

import java.io.Serializable;

public class Dto implements Serializable {
	private  String todo;
	
	public Dto() {}
	public Dto(String todo) {
		this.todo = todo;
	}
	
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}

}
