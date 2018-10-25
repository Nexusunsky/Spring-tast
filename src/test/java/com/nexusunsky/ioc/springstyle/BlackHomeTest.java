package com.nexusunsky.ioc.springstyle;


import com.nexusunsky.ioc.springstyle.role.BuyerRole;
import com.nexusunsky.ioc.springstyle.role.SellerRole;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BlackHouse.class)
public class BlackHomeTest {
    @Autowired
    private BuyerRole huluwa;

    @Autowired
    private SellerRole yeye;

    @Test
    public void testYeyeShouldNotBeNull() {
        assertNotNull(yeye);
    }

    @Test
    public void testBuy() {
        String goods = huluwa.buy();
        Assert.assertEquals("赵云的皮肤", goods);
    }
}
