package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Eid")
	private int id;
	
	@Column(name="Ename")
	private String eName;
	
	@Column(name="DOJ")
	private String dateOJ;
	
	@Column(name="YOE")
	private int yOE;
	
	@Column(name="Designation")
	private String designation;

}
