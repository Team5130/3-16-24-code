// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  
  private CANSparkMax TopintakeMotor;
  private CANSparkMax BottomintakeMotor;
 
  /** Creates a new Climber. */
  public Intake() {
    TopintakeMotor = new CANSparkMax(10, MotorType.kBrushless);
    BottomintakeMotor = new CANSparkMax(9, MotorType.kBrushless);
   }


  public void intake(double speed) {
    TopintakeMotor.set(speed);
    BottomintakeMotor.set(speed);

  }

   boolean suck = false;

    public void toggleIntake(){
    if (suck){
        suck = false;
        TopintakeMotor.set(0.7);
        BottomintakeMotor.set(-0.7);
        System.out.println("Intake is Running!");

    }
    else{
        suck = true;
        TopintakeMotor.set(0);
        BottomintakeMotor.set(0);
        System.out.println("Intake OFF!");
    }
}
 
} 
