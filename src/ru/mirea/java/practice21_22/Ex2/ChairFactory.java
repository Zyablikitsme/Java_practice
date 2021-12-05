package ru.mirea.java.practice21_22.Ex2;

public class ChairFactory {
    public VictorianChair createVictorianChair(){
        VictorianChair vicCh = new VictorianChair(15);
        System.out.println(vicCh.getAge());
        return vicCh;
    }

    public MagicChair createMagicChair(){
        MagicChair magCh = new MagicChair();
        magCh.doMagic();
        return magCh;
    }

    public MultifunctionalChair createMultifunctionalChair(){
        MultifunctionalChair mulCh = new MultifunctionalChair();
        System.out.println(mulCh.sum(1, -9));
        return mulCh;
    }
}
