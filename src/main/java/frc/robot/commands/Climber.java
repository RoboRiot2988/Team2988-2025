package frc.robot.commands;
import frc.robot.RobotContainer;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class Climber {
      public static Command moveLeftClimberUp() {
    return new InstantCommand(
      () -> RobotContainer.m_ClimbL.moveLeftClimbUp(),
      RobotContainer.m_ClimbL
    );
  }

    public static Command moveLeftClimberDown() {
    return new InstantCommand(
      () -> RobotContainer.m_ClimbL.moveLeftClimbDown(),
      RobotContainer.m_ClimbL
    );
  }

  public static Command moveRightClimberUp() {
    return new InstantCommand(
      () -> RobotContainer.m_ClimbR.moveRightClimbUp(),
      RobotContainer.m_ClimbR
    );
  }

    public static Command moveRightClimberDown() {
    return new InstantCommand(
      () -> RobotContainer.m_ClimbR.moveRightClimbDown(),
      RobotContainer.m_ClimbR
    );
  }
}
