package edu.eci.TaskPlanner.entities;

public class Task {
	private int id;
    private String titulo;
    private String descripcion;
    private String dueDate;
    private Status status;
    private User usuario;
    
    public Task() {}

	public Task(int id, String titulo, String descripcion, String dueDate, Status status, User usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.dueDate = dueDate;
		this.status = status;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettitulo() {
		return titulo;
	}

	public void setTitle(String titulo) {
		this.title = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescription(String descripcion) {
		this.description = descripcion;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUser(User usuario) {
		this.usuario = usuario;
	}
    
}
