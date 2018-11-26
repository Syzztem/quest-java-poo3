/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*																				*/
/*	Nature.java																	*/
/*																				*/
/*	made with <3 by Louis Thievent			  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄			*/
/*										      █  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄  █			*/
/*	louis.thievent@gmail.com			      █ █      ▄    ▄       █ █			*/
/*										      █ █   ▄        ▄▀▀▄   █ █▄▀▀▄		*/
/*	Created: 26-11-18 at 15:42:23		▄▀▀▄  █ █        ▄   █   ▀▄▄█▄▀   █		*/
/*										▀▄  ▀▀█ █     ▄      █            █		*/
/*										  ▀▀▄▄█ █  ▄        █   ▄█   ▄ ▄█  █	*/
/*										      █ █        ▄  █ ██ ▄  ▄  ▄ ███	*/
/*	Please don't feed the nyan cat		     ▄█  ▀▄▄▄▄▄▄▄▄▄▄▄▀▄  ▀▀▀▀▀▀▀ ▄▀		*/
/*										   ▄▀ ▄▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▀▀▀▀▀▀▀▀		*/
/*										   █▄▄▀  █▄▄▀        █▄▄▀ ▀▄▄█			*/
/*~~~~~~~~~~~~<3~M~A~Y~~~T~H~E~~~N~Y~A~N~~~B~E~~~W~I~T~H~~~Y~O~U~<3~~~~~~~~~~~~~*/
public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle eyeCherry = new Eagle("Eye Cherry");
        eyeCherry.takeOff();
        eyeCherry.ascend(120);
        eyeCherry.ascend(30);
        eyeCherry.glide();
        eyeCherry.descend(140);
        eyeCherry.land();
        eyeCherry.descend(9);
        eyeCherry.land();
    }
}
