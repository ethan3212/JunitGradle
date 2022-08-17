package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    // test grades ending in 9
    @Test
    void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.getGrade(59));
    } @Test
    void sixtyNineShouldReturnD() {
        var grader = new Grader();
        assertEquals('D', grader.getGrade(69));
    } @Test
    void seventyNineShouldReturnC() {
        var grader = new Grader();
        assertEquals('C', grader.getGrade(79));
    } @Test
    void eightyNineShouldReturnB() {
        var grader = new Grader();
        assertEquals('B', grader.getGrade(89));
    } @Test
    void ninetyNineShouldReturnA() {
        var grader = new Grader();
        assertEquals('A', grader.getGrade(99));
    }

    // test grades ending in 0
    @Test
    void zeroShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.getGrade(0));
    } @Test
    void fiftyShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.getGrade(50));
    } @Test
    void sixtyShouldReturnD() {
        var grader = new Grader();
        assertEquals('D', grader.getGrade(60));
    } @Test
    void seventyShouldReturnC() {
        var grader = new Grader();
        assertEquals('C', grader.getGrade(70));
    } @Test
    void eightyShouldReturnB() {
        var grader = new Grader();
        assertEquals('B', grader.getGrade(80));
    } @Test
    void ninetyShouldReturnA() {
        var grader = new Grader();
        assertEquals('A', grader.getGrade(90));
    }

    // test negative numbers
    @Test
    void negativeOneShouldThrowException() {
        var grader = new Grader();

        assertThrows(IllegalArgumentException.class,
                () -> grader.getGrade(-1));
    }
}