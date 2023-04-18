package Tests;

import Work.TestingClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestsOrder {

    @Test
    @Order(1)
    @Tag("acceptance")
    public void test1(){
        TestingClass testingClass = new TestingClass();
        assertEquals(4,testingClass.addition(2,2),"Проверка равенства");
    }

    @Test
    @Order(3)
    @Tag("acceptance")
    public void test2(){
        TestingClass testingClass = new TestingClass();
        assertEquals(5,testingClass.addition(3,2),"Проверка равенства");
    }

    @Test
    @Order(4)
    public void test3(){
        TestingClass testingClass = new TestingClass();
        assertEquals(6,testingClass.addition(4,2),"Проверка равенства");
    }

    @Test
    @Order(2)
    public void test4(){
        TestingClass testingClass = new TestingClass();
        assertEquals(7,testingClass.addition(5,2),"Проверка равенства");
    }
}
