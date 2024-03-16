// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
  
  private CANSparkMax RightfeederMotor;
  private CANSparkMax LeftfeederMotor;
 
  /** Creates a new Climber. */
  public Feeder() {
    RightfeederMotor = new CANSparkMax(17, MotorType.kBrushless);
    LeftfeederMotor = new CANSparkMax(16, MotorType.kBrushless);
   }


  public void feeder(double speed) {
    RightfeederMotor.set(speed);
    LeftfeederMotor.set(speed);

  }

   boolean eat = false;

  public void toggleFeeder(){
    if (eat){
        eat = false;
        RightfeederMotor.set(0.2);
        LeftfeederMotor.set(0.2);

    }
    else{
        eat = true;
        RightfeederMotor.set(0);
        LeftfeederMotor.set(0);
        
    }
}
  public void EviltoggleFeeder(){
    if (eat){
        eat = false;
        RightfeederMotor.set(-0.2);
        LeftfeederMotor.set(-0.2);

    }
    else{
        eat = true;
        RightfeederMotor.set(0);
        LeftfeederMotor.set(0);
        
    }
}
}
