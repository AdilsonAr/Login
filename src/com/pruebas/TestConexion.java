package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.conexion.Conexion;

class TestConexion extends Conexion{

	@Test
	void test() {
		this.conectar();
		assertNotNull(getCon());
	}

}
