public enum WeekDay {
    Pn(1),
    Wt(2),
    Sr(3),
    Czw(4),
    Pt(5),
    Sb(6),
    Nd(7);

    private final int number;

    private WeekDay(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
