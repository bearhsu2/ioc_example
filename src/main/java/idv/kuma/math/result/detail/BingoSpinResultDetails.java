package idv.kuma.math.result.detail;

import java.util.Map;

public class BingoSpinResultDetails {

    private Map<Integer, String> detailMap;

    public BingoSpinResultDetails(Map<Integer, String> detailMap) {
        this.detailMap = detailMap;
    }

    public Map<Integer, String> getDetailMap() {
        return detailMap;
    }

    public void setDetailMap(Map<Integer, String> detailMap) {
        this.detailMap = detailMap;
    }
}
