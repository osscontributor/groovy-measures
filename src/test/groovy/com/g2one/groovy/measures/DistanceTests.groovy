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
    
    void testAdding() {
        def distance = 9.meters + 200.centimeters
        assertEquals 1100, distance.centimeters
        assertEquals 11, distance.meters
    }
}
