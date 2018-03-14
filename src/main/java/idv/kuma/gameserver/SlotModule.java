package idv.kuma.gameserver;

import idv.kuma.math.probability.IProbability;
import idv.kuma.math.probability.SlotProbability;
import idv.kuma.math.result.SpinResult;

public class SlotModule {

    private IProbability slotProbability;


    public SlotModule() {
        this.slotProbability = new SlotProbability();
    }

    public SpinResult spin(){
        SpinResult spinResult = slotProbability.doSpin();
        System.out.println(spinResult);
        return spinResult;
    }
}
