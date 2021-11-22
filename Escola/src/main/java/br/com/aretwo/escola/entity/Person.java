/**
 * 
 */
package br.com.aretwo.escola.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Arthur Henrique
 * @email arthur.henriqu3@gmail.com
 *
 * @data 22 de nov. de 2021
 * 
 */

@MappedSuperclass
public abstract class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(length = 50, nullable = false)
	protected String firstName;
	
	@Column(length = 100)
	protected String lastName;
	
	@Column
	protected Character gender;
	
	@Column(nullable = false)
	protected LocalDate birthDate;
	
	/**
	 * 
	 */
	public Person() {
		init();

	}
	
	private void init() {
		id = null;
		firstName = null;
		lastName = null;
		gender = null;
		birthDate = null;
	}

}
