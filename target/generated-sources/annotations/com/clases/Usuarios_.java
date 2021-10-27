package com.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuarios.class)
public abstract class Usuarios_ {

	public static volatile SingularAttribute<Usuarios, String> pass;
	public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
	public static volatile SingularAttribute<Usuarios, Integer> numeroDeIntentos;
	public static volatile SingularAttribute<Usuarios, Boolean> admin;
	public static volatile SingularAttribute<Usuarios, String> nombreUsuario;
	public static volatile SingularAttribute<Usuarios, Integer> idEmpleados;
	public static volatile SingularAttribute<Usuarios, Boolean> activoUsuario;

}

