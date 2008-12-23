package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.NonSI
import javax.measure.unit.SI

class NumberDistanceMixin {

    static getFurlongs(Number self) {
        Measure.valueOf(self * 220, NonSI.YARD)
    }
    
    static getMiles(Number self) {
        Measure.valueOf(self, NonSI.MILE)
    }

    static getYards(Number self) {
        Measure.valueOf(self, NonSI.YARD)
    }
    
    static getFeet(Number self) {
        Measure.valueOf(self, NonSI.FOOT)
    }

    static getInches(Number self) {
        Measure.valueOf(self, NonSI.INCH)
    }

    static getKilometers(Number self) {
        Measure.valueOf(self, SI.KILO(SI.METER))
    }

    static getMeters(Number self) {
        Measure.valueOf(self, SI.METER)
    }
    
    static getCentimeters(Number self) {
        Measure.valueOf(self, SI.CENTI(SI.METER))
    }
    
    static getMillimeters(Number self) {
        Measure.valueOf(self, SI.MILLI(SI.METER))
    }
    
    static getMicrometers(Number self) {
        Measure.valueOf(self, SI.MICRO(SI.METER))
    }
    
    static getNanometers(Number self) {
        Measure.valueOf(self, SI.NANO(SI.METER))
    }
    
    static multiply(Number self, Measure measure) {
        def measureInMeters = measure.doubleValue(SI.METER)
        Measure.valueOf(measureInMeters * self, SI.METER)
    }

}
