package HW_1;
//Упражнение 2.1 (стр. 64)

import java.io.IOException;

public class Sound {
    public static void main(String[] args) throws IOException {
        double dist, sound_speed=1100.0, delay;

        delay=4.3;

        dist=delay*sound_speed;

        System.out.println("Distance to the thunder is "+dist+" foots");

        //Number 6 echo

        double echo_delay, echo_dist;

        echo_delay=7.2;

        echo_dist=echo_delay/2*sound_speed;

        System.out.println("Distance to the object is "+echo_dist+" foots");
    }
}