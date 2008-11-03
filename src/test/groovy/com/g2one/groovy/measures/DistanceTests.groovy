package com.g2one.groovy.measures

class DistanceTests extends GroovyTestCase {

    void setUp() {
        Class.forName 'com.g2one.groovy.measures.GroovyMeasures'
    }
    
    void testConversions() {
        def len = 2.kilometers
        assertEquals 2.0,    len.kilometers,  0.00001
        assertEquals 2.0E3,  len.meters,      0.00001
        assertEquals 2.0E5,  len.centimeters, 0.00001
        assertEquals 2.0E6,  len.millimeters, 0.00001
        assertEquals 2.0E9,  len.micrometers, 0.00001
        assertEquals 2.0E12, len.nanometers,  0.00001

        def len2 = 400.centimeters
        assertEquals 4.0E-3, len2.kilometers,  0.00001
        assertEquals 4.0,    len2.meters,      0.00001
        assertEquals 4.0E2,  len2.centimeters, 0.00001
        assertEquals 4.0E3,  len2.millimeters, 0.00001
        assertEquals 4.0E6,  len2.micrometers, 0.00001
        assertEquals 4.0E9,  len2.nanometers,  0.00001
    }
}