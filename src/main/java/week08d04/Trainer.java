package week08d04;

public class Trainer implements CanMark {

    public static void main(String[] args) {
        Trainer trainer = new Trainer(new BadMood());
        System.out.println(trainer.giveMark());
        Trainer trainerG = new Trainer(new GoodMood());
        System.out.println(trainerG.giveMark());
    }

    private CanMark can;

    public Trainer(CanMark can) {
        this.can = can;
    }

    @Override
    public int giveMark(){
        return can.giveMark();
    }
}
