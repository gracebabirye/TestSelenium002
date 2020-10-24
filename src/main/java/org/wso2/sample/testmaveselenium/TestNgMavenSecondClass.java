/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wso2.sample.testmaveselenium;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 *
 * @author GRACE
 */
public class TestNgMavenSecondClass {
    @Test
    public void oneMoreTest() {
        System.out.println("---------------------------------------------2");
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
}
