package models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
	@Column(name="idempleado")
	private int eidempleado;
	
	@Column (name= "apellido")
	private String apellido;
	
	@Column (name="nombres")
	private String nombres;
	
	@Column(name="edad")
	private String edad;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="salario")
	private String salario;
	
	
	public Empleado() {
	}
	
	public Empleado(String apellido, String nombres, String edad, String sexo, String salario) {
		this.apellido = apellido;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	public int getEidempleado() {
		return eidempleado;
	}
	public void setEidempleado(int eidempleado) {
		this.eidempleado = eidempleado;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "empleado [eidempleado=" + eidempleado + ", apellido=" + apellido + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	

}
