package com.dao;

import com.modelos.*;
import java.sql.*;
import com.conexion.Conexion;
import java.util.*;

public class DaoUsuario extends Conexion{
	
	public String insertar(Usuario us)
	{
		try
		{
			this.conectar();
			String sql="insert into personas (nombre,apellido,usuario,contrasena,pais,tecnologia) values(?,?,?,?,?,?)";
			PreparedStatement prep=getCon().prepareStatement(sql);
			prep.setString(1, us.getNombre());
			prep.setString(2, us.getApellido());
			prep.setString(3, us.getUsuario());
			prep.setString(4, us.getContrasena());
			prep.setString(5, us.getPais());
			prep.setString(6, us.getTecnologia());
			prep.executeUpdate();
			return "Usuario registrado correctamente";
		}
		
		catch(Exception e)
		{
			return "Ha ocurrido un error, intente de nuevo mas tarde";
		}
		
		finally
		{
			this.desconectar();
		}
	}
	
	public void editar()
	{
		try
		{
			this.conectar();
		}
		
		catch(Exception e)
		{
		}
		
		finally
		{
			this.desconectar();
		}
	}
	
	public void eliminar()
	{
		try
		{
			this.conectar();
		}
		
		catch(Exception e)
		{
		}
		
		finally
		{
			this.desconectar();
		}
	}
	
	public ArrayList<Usuario> mostrar()
	{
		ArrayList<Usuario> lista=null;
		try
		{
			this.conectar();
		}
		
		catch(Exception e)
		{
		}
		
		finally
		{
			this.desconectar();
		}
		return lista;
	}
	
	public String comprobar(String usuario, String contrasena)
	{
		ResultSet res;
		try
		{
			this.conectar();
			String sql="select nombre,usuario,contrasena from personas where usuario=? and contrasena=?;";
			PreparedStatement prep=getCon().prepareStatement(sql);
			prep.setString(1, usuario);
			prep.setString(2, contrasena);
			res=prep.executeQuery();
			
			if(res.next())
			{
				return "Bienvenido "+res.getString("nombre");
			}
			
			else
			{
				return "Los datos ingresados son incorrectos";
			}
		}
		
		catch(Exception e)
		{
			return "Ha ocurrido un error, intente de nuevo mas tarde";
		}
		
		finally
		{
			this.desconectar();
		}
	}

}
