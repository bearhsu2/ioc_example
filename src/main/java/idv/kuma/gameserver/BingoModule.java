package idv.kuma.gameserver;

import com.sun.org.apache.xpath.internal.operations.Mod;
import idv.kuma.math.probability.BingoProbability;
import idv.kuma.math.probability.IProbability;
import idv.kuma.math.result.SpinResult;

public class BingoModule implements Module{


    private IProbability bingoProbability = new BingoProbability();

    public BingoModule() {
        this.bingoProbability = new BingoProbability();
    }


    public SpinResult spin() {
        return bingoProbability.doSpin();
    }
}
