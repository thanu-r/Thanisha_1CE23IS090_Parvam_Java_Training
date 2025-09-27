package com.gaming.entity;

import jakarta.persistence.*;   //creating database

@Entity
@Table(name="games")
public class Game {
	@Id
	@GeneratedValues(strategy=GenerationType.IDENTITY) //auto increment 
	private long gameId;
	@Colunm(nullable = false,length = 100) 
	private String Name;
	@Colunm(nullable = false, precision = 10, scale = 2)
	private double costPerHour;
	@Enumerated(EnumType.STRING)
	@
}
