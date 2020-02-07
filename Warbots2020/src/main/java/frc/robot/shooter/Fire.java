/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Fire extends CommandBase
{
  //region Constructors
  public Fire(Shooter s, double speed) 
  {
    shooter = s;
    targetVelocity = speed;
    addRequirements(shooter);
  }
  //endregion

  //region Overrides
  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    shooter.setShootSpeed(targetVelocity);
    shooter.load();
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
    return !shooter.ballLoaded();
  }
  //endregion

  //region Fields
  private final Shooter shooter;
  private final double targetVelocity;
  //endregion
}   