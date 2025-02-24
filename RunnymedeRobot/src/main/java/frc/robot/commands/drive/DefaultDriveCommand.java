package frc.robot.commands.drive;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DefaultDriveCommand extends CommandBase {

	private final DriveSubsystem driveSubsystem;
	private final PS4Controller driverController;

	/**
	 * Creates a new ExampleCommand.
	 *
	 * @param driveSubsystem The subsystem used by this command.
	 */
	public DefaultDriveCommand(PS4Controller driverController, DriveSubsystem driveSubsystem) {

		this.driverController = driverController;
		this.driveSubsystem = driveSubsystem;

		// Use addRequirements() here to declare subsystem dependencies.
		addRequirements(driveSubsystem);
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {

		// FIXME: What should we put here?
		driveSubsystem.setMotorSpeeds(0.5, 0.5);
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
