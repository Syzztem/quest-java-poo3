/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*																				*/
/*	Eagle.java																	*/
/*																				*/
/*	made with <3 by Louis Thievent			  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄			*/
/*										      █  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄  █			*/
/*	louis.thievent@gmail.com			      █ █      ▄    ▄       █ █			*/
/*										      █ █   ▄        ▄▀▀▄   █ █▄▀▀▄		*/
/*	Created: 26-11-18 at 15:38:29		▄▀▀▄  █ █        ▄   █   ▀▄▄█▄▀   █		*/
/*										▀▄  ▀▀█ █     ▄      █            █		*/
/*										  ▀▀▄▄█ █  ▄        █   ▄█   ▄ ▄█  █	*/
/*										      █ █        ▄  █ ██ ▄  ▄  ▄ ███	*/
/*	Please don't feed the nyan cat		     ▄█  ▀▄▄▄▄▄▄▄▄▄▄▄▀▄  ▀▀▀▀▀▀▀ ▄▀		*/
/*										   ▄▀ ▄▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▀▀▀▀▀▀▀▀		*/
/*										   █▄▄▀  █▄▄▀        █▄▄▀ ▀▄▄█			*/
/*~~~~~~~~~~~~<3~M~A~Y~~~T~H~E~~~N~Y~A~N~~~B~E~~~W~I~T~H~~~Y~O~U~<3~~~~~~~~~~~~~*/
public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {

        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
	
	@Override
	public void takeOff()
	{
		System.out.println(this.getName() + (flying ? " is already flying" : " takes off from the cliff"));
	}

	@Override
	public int ascend(int meters)
	{
		this.altitude += meters;
		System.out.println(this.getName() + " ascends " + meters + " meters");
		return this.altitude;
	}

	@Override
	public int descend(int meters)
	{
		this.altitude -= meters;
		System.out.println(this.getName() + ((altitude < 0) ? " hits the ground and dies" : ("descends " + meters + " meters")));
		return this.altitude;
	}

	@Override
	public void land()
	{
		if (this.altitude > 100)
			System.out.println(this.getName() + is too high, he can't land!);
		else {
		this.altitude = 0;
		System.out.println(this.getName() + " lands graciously");
		}
	}

	public void glide()
	{
		System.out.print("Like the king of the sky, ");
	}

}
