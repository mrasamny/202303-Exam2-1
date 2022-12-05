import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam2Test {

	public static String toString(int[] anArray){
        String result = "{";
        for(int index = 0; index < anArray.length-1; index++){
            result += anArray[index]+", ";
        }
        if (anArray.length > 0){
            result += anArray[anArray.length-1];
        }
        result += "}";
        return result;
    }
	
    @Test
    @DisplayName("[4] Test 1st Bubble")
    void bubble_1() {
        int[] a = {1,9,3,6,2};
        int[] expected = {1,3,6,2,9};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[4] Test 2nd Bubble")
    void bubble_2() {
        int[] a = {100,75,50,25,0};
        int[] expected = {75,50,25,0,100};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[4] Test 3rd Bubble")
    void bubble_3() {
        int[] a = {100,75};
        int[] expected = {75,100};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[4] Test 4th Bubble")
    void bubble_4() {
        int[] a = {4};
        int[] expected = {4};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }

    @Test
    @DisplayName("[4] Test 5th Bubble")
    void bubble_5() {
        int[] a = {};
        int[] expected = {};
        Exam2.bubble(a);
        assertArrayEquals(expected,a,"Expected: "+toString(expected)+"\nActual: "+toString(a));
    }
}