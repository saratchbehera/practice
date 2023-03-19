package com.sarat.designPatterns.structural_Design_Patterns.Adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
	
	Random generator = new Random();

	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Tank does "+attackDamage + " Damage");
		
	}

	@Override
	public void driveForword() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Tank moves "+movement + " spaces");
		
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName + "is driving the tank");
	}

}
