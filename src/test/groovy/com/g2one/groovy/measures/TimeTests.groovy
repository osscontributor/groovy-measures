package com.g2one.groovy.measures

class TimeTests extends GroovyTestCase {

    void setUp() {
        Class.forName 'com.g2one.groovy.measures.GroovyMeasures'
    }

    void testConversions() {
        assertEquals 2.days, 48.hours
        assertEquals 48.0.hours, 2.88E3.minutes
        assertEquals 2.88E3.minutes, 1.728E5.seconds
        assertEquals 1.728E5.seconds, 1.728E8.milliseconds
    }

    void testRetrivingValues() {
        def time = 1.728E5.seconds
        assertEquals 1.728E8, time.milliseconds
        assertEquals 1.728E5, time.seconds
        assertEquals 2.88E3, time.minutes
        assertEquals 48.0, time.hours
        assertEquals 2.0, time.days
    }

    void testAddition() {
        def result = 120.minutes + 3.hours
        assertEquals 5, result.hours
    }

    void testSubtraction() {
        def result = 2.days - 16.hours
        assertEquals 32, result.hours
    }

    void testMultiplication() {
        def result = 24.hours * 2
        assertEquals 2, result.days
    }

    void testDivision() {
        def result = 2.days / 60
        assertEquals 48, result.minutes
    }
}