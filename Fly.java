/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*																				*/
/*	Fly.java																	*/
/*																				*/
/*	made with <3 by Louis Thievent			  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄			*/
/*										      █  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄  █			*/
/*	louis.thievent@gmail.com			      █ █      ▄    ▄       █ █			*/
/*										      █ █   ▄        ▄▀▀▄   █ █▄▀▀▄		*/
/*	Created: 26-11-18 at 15:42:02		▄▀▀▄  █ █        ▄   █   ▀▄▄█▄▀   █		*/
/*										▀▄  ▀▀█ █     ▄      █            █		*/
/*										  ▀▀▄▄█ █  ▄        █   ▄█   ▄ ▄█  █	*/
/*										      █ █        ▄  █ ██ ▄  ▄  ▄ ███	*/
/*	Please don't feed the nyan cat		     ▄█  ▀▄▄▄▄▄▄▄▄▄▄▄▀▄  ▀▀▀▀▀▀▀ ▄▀		*/
/*										   ▄▀ ▄▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▀▀▀▀▀▀▀▀		*/
/*										   █▄▄▀  █▄▄▀        █▄▄▀ ▀▄▄█			*/
/*~~~~~~~~~~~~<3~M~A~Y~~~T~H~E~~~N~Y~A~N~~~B~E~~~W~I~T~H~~~Y~O~U~<3~~~~~~~~~~~~~*/
public interface Fly{

	public void takeOff();

	public int ascend(int meters);

	public int descend(int meters);

	public void land();

	public static void glide()
	{
		System.out.println("It glides into the air.");
	}
}
