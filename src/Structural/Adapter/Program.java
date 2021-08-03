package Structural.Adapter;

public class Program {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(8);
        RoundPeg rpeg = new RoundPeg(9);

//        System.out.println(hole.fits(rpeg));

        SquarePeg sSquarePeg =  new SquarePeg(3);
        SquarePeg xxlSquarePeg =  new SquarePeg(50);
        //hole.fits(sSquarePeg);
        SquarePegAdapter sSquarePegAdapter = new SquarePegAdapter(sSquarePeg);
        SquarePegAdapter xxlSquarePegAdapter = new SquarePegAdapter(xxlSquarePeg);
        System.out.println(hole.fits(sSquarePegAdapter));
        System.out.println(hole.fits(xxlSquarePegAdapter));
    }
}
