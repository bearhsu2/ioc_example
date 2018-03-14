package idv.kuma.math.result;

import com.google.gson.annotations.SerializedName;



// TODO 3: explain why this avoids feature envy => BingoSpinResultDetails
//                                              => BingoSpinResult.getXXXMap.get(new Long(1));
public class BingoSpinResult implements SpinResult {

    @SerializedName("w")
    private long win;

    @SerializedName("b")
    private long bet;

    @SerializedName("-.-a")
    private int bingoBingo;


    public long getWin() {
        return win;
    }

    public long getBet() {
        return bet;
    }

    public int getLine() {
        return 0;
    }

    public void setWin(long win) {
        this.win = win;
    }

    public void setBet(long bet) {
        this.bet = bet;
    }

    public int getBingoBingo() {
        return bingoBingo;
    }

    public void setBingoBingo(int bingoBingo) {
        this.bingoBingo = bingoBingo;
    }
}
