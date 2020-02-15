/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.shuffleboard;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.drivetrain.*;
import frc.robot.bling.*;
import frc.robot.climber.*;
import frc.robot.shooter.*;
import frc.robot.intake.*;
import frc.robot.loader.*;

public class Update extends CommandBase 
{

  public Update(Shuffleboard shuffleboard, DriveTrain drivetrain, Climber climber, Shooter shooter, Intake intake, Loader loader, Bling bling) 
  {
    addRequirements(shuffleboard);
 
    SmartDashboard.putData(drivetrain);
    SmartDashboard.putData(climber);
    SmartDashboard.putData(shooter);
    SmartDashboard.putData(intake);
    SmartDashboard.putData(loader);
    SmartDashboard.putData(bling);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {   
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() 
  {
    return false;
  }
}
