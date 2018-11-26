/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*																				*/
/*	Bird.java																	*/
/*																				*/
/*	made with <3 by Louis Thievent			  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄			*/
/*										      █  ▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄  █			*/
/*	louis.thievent@gmail.com			      █ █      ▄    ▄       █ █			*/
/*										      █ █   ▄        ▄▀▀▄   █ █▄▀▀▄		*/
/*	Created: 26-11-18 at 15:40:48		▄▀▀▄  █ █        ▄   █   ▀▄▄█▄▀   █		*/
/*										▀▄  ▀▀█ █     ▄      █            █		*/
/*										  ▀▀▄▄█ █  ▄        █   ▄█   ▄ ▄█  █	*/
/*										      █ █        ▄  █ ██ ▄  ▄  ▄ ███	*/
/*	Please don't feed the nyan cat		     ▄█  ▀▄▄▄▄▄▄▄▄▄▄▄▀▄  ▀▀▀▀▀▀▀ ▄▀		*/
/*										   ▄▀ ▄▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▀▀▀▀▀▀▀▀		*/
/*										   █▄▄▀  █▄▄▀        █▄▄▀ ▀▄▄█			*/
/*~~~~~~~~~~~~<3~M~A~Y~~~T~H~E~~~N~Y~A~N~~~B~E~~~W~I~T~H~~~Y~O~U~<3~~~~~~~~~~~~~*/
public abstract class Bird {
  
    // attributs  
    private String name;  
    private int age;
  
    // constructeurs  
    public Bird(String name) {  
        this.name = name;  
        this.age = 0;  
    }  
  
    // accesseurs et mutateurs  
    public String getName() {  
        return this.name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return this.age;  
    }  
  
    public void setAge(int age) {
        this.age = age;
    }

    // méthodes
    public abstract String sing();
}
