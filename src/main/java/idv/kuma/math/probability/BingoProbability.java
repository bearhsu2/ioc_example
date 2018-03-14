package idv.kuma.math.probability;

import idv.kuma.math.result.BingoSpinResult;
import idv.kuma.math.result.SpinResult;

public class BingoProbability implements IProbability {

    private BingoSpinResult bingoSpinResult;

    public BingoProbability() {
        this.bingoSpinResult = new BingoSpinResult();
    }

    public SpinResult doSpin() {

        bingoSpinResult.setBet(33L);
        bingoSpinResult.setBingoBingo(55);
        bingoSpinResult.setWin(999L);

        return this.bingoSpinResult;
    }
}
