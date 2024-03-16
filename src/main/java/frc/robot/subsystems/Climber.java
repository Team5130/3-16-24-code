// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  
  private CANSparkMax RightclimberMotor;
  private CANSparkMax LeftclimberMotor;
 
  /** Creates a new Climber. */
  public Climber() {
    RightclimberMotor = new CANSparkMax(15, MotorType.kBrushless);
    LeftclimberMotor = new CANSparkMax(14, MotorType.kBrushless);
   }


  public void climber(double speed) {
    RightclimberMotor.set(speed);
    LeftclimberMotor.set(speed);

  }

   boolean climb = false;

    public void toggleClimber(){
    if (climb){
        climb = false;
        RightclimberMotor.set(0.3);
        LeftclimberMotor.set(-0.3);

    }
    else{
        climb = true;
        RightclimberMotor.set(0);
        LeftclimberMotor.set(0);
        
    }
}

public void EviltoggleClimber(){
    if (climb){
        climb = false;
        RightclimberMotor.set(-0.3);
        LeftclimberMotor.set(0.3);
    }
    else{
        climb = true;
        RightclimberMotor.set(0);
        LeftclimberMotor.set(0);
    }
} 

} 
