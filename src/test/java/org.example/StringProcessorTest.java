package org.example;

import org.example.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {
    @Test
    public void multiplyOfString() {
        Assertions.assertEquals("", StringProcessor.multiplyOfString("", 3));
        Assertions.assertEquals("123123123", StringProcessor.multiplyOfString("123", 3));
        Assertions.assertEquals("", StringProcessor.multiplyOfString("", 3));
        Assertions.assertEquals("", StringProcessor.multiplyOfString("", 0));
    }
    @Test
    public void multiplyOfError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.multiplyOfString("", -1));
    }

    @Test
    public void countEntryTest(){
        Assertions.assertEquals(3,StringProcessor.countEntryTest("123123123","123"));
        Assertions.assertEquals(2,StringProcessor.countEntryTest("aaa","aa"));
        //Assertions.assertEquals(3,StringProcessor.searchForSubstring("123","124"));

    }

    @Test
    public void replaceNumbers(){
        Assertions.assertEquals("У человека один нос, два уха и четыре больших пальца", StringProcessor.replaceNumbers("У человека 1 нос, 2 уха и 4 больших пальца"));
        Assertions.assertEquals("одинодинодинодин4", StringProcessor.replaceNumbers("11114"));
    }

    @Test
    public void delStr(){
        Assertions.assertEquals(new StringBuilder("1111").toString(),StringProcessor.delStr(new StringBuilder("12121212")).toString());
    }

    @Test
    public void searchForSubstringErrors() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.searchForSubstring("132", ""));
    }
}