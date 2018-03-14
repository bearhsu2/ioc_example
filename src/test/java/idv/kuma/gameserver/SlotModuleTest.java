package idv.kuma.gameserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import idv.kuma.common.Constants;
import idv.kuma.math.result.SpinResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlotModuleTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void spin_Default() throws Exception {

        SlotModule slotModule = new SlotModule();

        SpinResult spinResult = slotModule.spin();

        String string = Constants.GSON.toJson(spinResult);

        System.out.println(string);



    }

}