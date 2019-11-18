package com.modelos;

public class Usuario {
	private int id;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String pais;
	private String tecnologia;

	
	public Usuario()
	{		
	}
	
	public Usuario(int id,String nombre,String apellido,String usuario,String contrasena,String pais,String tecnologia)
	{	
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.usuario=usuario;
		this.contrasena=contrasena;
		this.pais=pais;
		this.tecnologia=tecnologia;
	} 
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	
	public String getUsuario()
	{
		return usuario;
	}
	
	public void setUsuario(String usuario)
	{
		this.usuario=usuario;
	}
	
	public String getContrasena()
	{
		return contrasena;
	}
	
	public void setContrasena(String contrasena)
	{
		this.contrasena=contrasena;
	}
	
	public String getPais()
	{
		return pais;
	}
	
	public void setPais(String pais)
	{
		this.pais=pais;
	}
	
	public String getTecnologia()
	{
		return tecnologia;
	}
	
	public void setTecnologia(String tecnologia)
	{
		this.tecnologia=tecnologia;
	}
	
}
