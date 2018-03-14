package idv.kuma.math.result;

public class SlotSpinResult implements SpinResult {


    private long win;
    private long bet;


    // TODO 1: make this attribute invisible
    private int line;

    public SlotSpinResult(long win, long bet, int line) {
        this.win = win;
        this.bet = bet;
        this.line = line;
    }

    public long getWin() {
        return 0;
    }

    public long getBet() {
        return 0;
    }

    public int getLine() {
        return 0;
    }


}
