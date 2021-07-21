package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Empleados.class)
public abstract class Empleados_ {

	public static volatile SingularAttribute<Empleados, Timestamp> fechaDeNacimiento;
	public static volatile SingularAttribute<Empleados, Integer> idSexo;
	public static volatile SingularAttribute<Empleados, Boolean> activoEmpleado;
	public static volatile SingularAttribute<Empleados, String> apellidoEmpleado;
	public static volatile SingularAttribute<Empleados, String> correoEmpleado;
	public static volatile SingularAttribute<Empleados, Integer> idTipoDocumento;
	public static volatile SingularAttribute<Empleados, String> documento;
	public static volatile SingularAttribute<Empleados, Integer> idEmpleados;
	public static volatile SingularAttribute<Empleados, String> nombreEmpleado;
	public static volatile SingularAttribute<Empleados, Integer> telefonoEmpleado;

}

