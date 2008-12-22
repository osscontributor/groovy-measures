package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.SI
import javax.measure.unit.NonSI

class NumberMixin {

    static def getMiles(Number self) {
        Measure.valueOf(self, NonSI.MILE)
    }

    static def getYards(Number self) {
        Measure.valueOf(self, NonSI.YARD)
    }
    
    static def getFeet(Number self) {
        Measure.valueOf(self, NonSI.FOOT)
    }

    static def getInches(Number self) {
        Measure.valueOf(self, NonSI.INCH)
    }

    static def getKilometers(Number self) {
        Measure.valueOf(self, SI.KILO(SI.METER))
    }

    static def getMeters(Number self) {
        Measure.valueOf(self, SI.METER)
    }
    
    static def getCentimeters(Number self) {
        Measure.valueOf(self, SI.CENTI(SI.METER))
    }
    
    static def getMillimeters(Number self) {
        Measure.valueOf(self, SI.MILLI(SI.METER))
    }
    
    static def getMicrometers(Number self) {
        Measure.valueOf(self, SI.MICRO(SI.METER))
    }
    
    static def getNanometers(Number self) {
        Measure.valueOf(self, SI.NANO(SI.METER))
    }
    
    static def multiply(Number self, Measure measure) {
        def measureInMeters = measure.doubleValue(SI.METER)
        Measure.valueOf(measureInMeters * self, SI.METER)
    }

}
