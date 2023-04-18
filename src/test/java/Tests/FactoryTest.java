package Tests;

import Work.TestingClass;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class FactoryTest {

    TestingClass testingClass = new TestingClass();

    @TestFactory
    Collection<DynamicTest> dynamicTest1() {
        return Arrays.asList(
                dynamicTest("first dynamicTest", () -> assertEquals(4, testingClass.addition(2, 2))),
                dynamicTest("second dynamicTest", () -> assertEquals(5, testingClass.addition(3, 2))),
                dynamicTest("third dynamicTest", () -> assertEquals(6, testingClass.addition(4, 2)))
        );
    }

    @Test
    DynamicTest[] dynamicTest2() {
        return new DynamicTest[]{
                dynamicTest("first dynamicTest", () -> assertEquals(10, testingClass.addition(5, 5))),
                dynamicTest("second dynamicTest", () -> assertEquals(11, testingClass.addition(9, 2)))
        };
    }
}

