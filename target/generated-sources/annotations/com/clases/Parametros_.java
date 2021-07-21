package com.clases;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Parametros.class)
public abstract class Parametros_ {

	public static volatile SingularAttribute<Parametros, Timestamp> fechaCaducidad;
	public static volatile SingularAttribute<Parametros, Integer> facturaFinal;
	public static volatile SingularAttribute<Parametros, Integer> idParametros;
	public static volatile SingularAttribute<Parametros, String> cai;
	public static volatile SingularAttribute<Parametros, Timestamp> fechaEmision;
	public static volatile SingularAttribute<Parametros, Integer> facturaInicial;
	public static volatile SingularAttribute<Parametros, Boolean> activoParametros;

}

