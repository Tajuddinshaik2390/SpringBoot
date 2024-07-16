package com.springboot.prac.entity;



	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "jobholder")
	public class Jobholder {
			
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private int id;
		@Column(name = "FIRST_NAME",nullable =false )
		private String firstName;
		@Column(name = "LAST_NAME")
		private String lastName;
//		public StudentEntity(int id,String firstName,String lastName) {
//			this.id=id;
//			this.firstName=firstName;
//			this.lastName=lastName;

		// }
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}


