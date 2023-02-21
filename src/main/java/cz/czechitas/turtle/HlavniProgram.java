package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka=new Turtle();

    /*
    HlavniProgram(Turtle zofka){
        this.zofka=zofka;
    }

     */

    public void start() {
      obdelnik(100,200);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        obdelnik(300, 200);

        /* ctverec(200, Color.RED);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

        ctverec(200,Color.RED);

         */

       /* zofka = new Turtle();
        zofka.move(100);
        pokracovani(7);

        */
    }

    public void obdelnik(double delkaStranyA,double delkaStranyB){
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);

        }

    }
    /* public void ctverec(double delkaStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i =0; i<4; i++){
            zofka.move(200);
            zofka.turnRight(90);


        }
    }

     */

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
