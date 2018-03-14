package idv.kuma.math.probability;

import idv.kuma.math.result.SlotSpinResult;
import idv.kuma.math.result.SpinResult;

public class SlotProbability implements IProbability {


    public SlotProbability() {
    }

    public SpinResult doSpin() {

        SpinResult spinResult = new SlotSpinResult(1000L, 300L, 50);

        return spinResult;
    }
}
