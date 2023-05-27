package br.com.firmino.erp.model;

import javax.annotation.Generated;
import javax.persistence.TemporalType;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-05-16T11:03:24.045-0400")
@StaticMetamodel(Empresa.class)
public class Empresa_ {
	public static volatile SingularAttribute<Empresa, Long> id;
	public static volatile SingularAttribute<Empresa, String> nomeFantasia;
	public static volatile SingularAttribute<Empresa, String> razaoSocial;
	public static volatile SingularAttribute<Empresa, String> cnpj;
	public static volatile SingularAttribute<Empresa, TemporalType> dataFundacao;
	public static volatile SingularAttribute<Empresa, RamoAtividade> ramoAtividade;
	public static volatile SingularAttribute<Empresa, TipoEmpresa> tipo;
}
