package com.g2one.groovy.measures

class DistanceTests extends GroovyTestCase {

    void setUp() {
        Class.forName 'com.g2one.groovy.measures.GroovyMeasures'
    }

    void testConversions() {
        def len = 2.kilometers
        assertEquals 2.0,    len.kilometers
        assertEquals 2.0E3,  len.meters
        assertEquals 2.0E5,  len.centimeters
        assertEquals 2.0E6,  len.millimeters
        assertEquals 2.0E9,  len.micrometers
        assertEquals 2.0E12, len.nanometers

        def len2 = 400.centimeters
        assertEquals 4.0E-3, len2.kilometers
        assertEquals 4.0,    len2.meters
        assertEquals 4.0E2,  len2.centimeters
        assertEquals 4.0E3,  len2.millimeters
        assertEquals 4.0E6,  len2.micrometers
        assertEquals 4.0E9,  len2.nanometers
    }
    
    void testAddition() {
        def distance = 9.meters + 200.centimeters
        assertEquals 1100, distance.centimeters
        assertEquals 11, distance.meters
    }
    
    void testSubtraction() {
        def result = 9.meters - 200.centimeters
        assertEquals 700, result.centimeters
        assertEquals 7, result.meters
    }
    
    void testDivision() {
        def result = 21.meters / 3
        assertEquals 7, result.meters
    }
    
    void testMultiplyingMeasureByNumber() {
        def result = 5.meters * 4
        assertEquals 20, result.meters
    }
    
    void testMultiplyingNumberByMeasure() {
        def result = 4 * 5.meters
        assertEquals 20, result.meters
    }
    
    void testComparisons() {
        assertEquals 9.0.kilometers, 9.0E3.meters
        assertEquals 9.0E3.meters, 9.0E5.centimeters
        assertEquals 9.0E5.centimeters, 9.0E6.millimeters
        assertEquals 9.0E6.millimeters, 9.0E9.micrometers
        assertEquals 9.0E9.micrometers, 9.0E12.nanometers
    }
}
