// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  
  private CANSparkMax TopshooterMotor;
  private CANSparkMax BottomshooterMotor;
 
  /** Creates a new Climber. */
  public Shooter() {
    TopshooterMotor = new CANSparkMax(20, MotorType.kBrushless);
    BottomshooterMotor = new CANSparkMax(12, MotorType.kBrushless);
   }


  public void shooter(double speed) {
    TopshooterMotor.set(speed);
    BottomshooterMotor.set(speed);

  }

   boolean shoot = false;

    public void toggleShooter(){
    if (shoot){
        shoot = false;
        TopshooterMotor.set(0.95);
        BottomshooterMotor.set(0.9);
      System.out.println("SHOOTER ON!");

    }
    else{
        shoot = true;
        TopshooterMotor.set(0);
        BottomshooterMotor.set(0);
      System.out.println("NOT SHOOTING!");
    }
}

} 
