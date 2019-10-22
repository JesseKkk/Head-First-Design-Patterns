

public class RemoteLoader
{
	public static void main(String[] args)
	{
		RemoteControl remoteControl = new RemoteControl();
		Light livingLight = new Light("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		LightOnCommand livingLightOn = new LightOnCommand(livingLight);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		
		LightOffCommand livingLightOff = new LightOffCommand(livingLight);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		Command[] partyOn = {livingLightOn, ceilingFanHigh};
		Command[] partOff = {livingLightOff, ceilingFanOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);
		System.out.println("--- Pushing Macro undo ---");		
		remoteControl.undoButtonWasPushed();		

	}
}