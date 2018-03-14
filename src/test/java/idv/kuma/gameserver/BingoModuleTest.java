package idv.kuma.gameserver;

import com.sun.org.apache.xpath.internal.operations.Mod;
import idv.kuma.common.Constants;
import idv.kuma.math.result.SpinResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BingoModuleTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void spin() throws Exception {

        Module bingoModule = new BingoModule();

        SpinResult result = bingoModule.spin();

        String string = Constants.GSON.toJson(result);

        System.out.println(string);
    }

}