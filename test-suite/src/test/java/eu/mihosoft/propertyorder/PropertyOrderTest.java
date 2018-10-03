package eu.mihosoft.propertyorder;

import eu.mihosoft.vmftest.propertyorder.CustomOrder;
import eu.mihosoft.vmftest.propertyorder.DefaultOrder;
import org.junit.Assert;
import org.junit.Test;

public class PropertyOrderTest {

    @Test
    public void propertyDefaultOrderTest() {

        DefaultOrder defaultOrder = DefaultOrder.newInstance();

        String[] propertiesD = new String[] {"b", "d", "x", "z"};

        for(int i = 0; i < defaultOrder.vmf().reflect().properties().size(); i++) {
            Assert.assertEquals(propertiesD[i], defaultOrder.vmf().reflect().properties().get(i).getName());
        }

    }

    @Test
    public void propertyCustomOrderTest() {

        CustomOrder customOrder = CustomOrder.newInstance();

        String[] propertiesC = new String[] {"z", "b", "d", "x"};

        for(int i = 0; i < customOrder.vmf().reflect().properties().size(); i++) {
            Assert.assertEquals(propertiesC[i], customOrder.vmf().reflect().properties().get(i).getName());
        }

    }

}