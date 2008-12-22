package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.SI
import javax.measure.unit.NonSI

class MeasureMixin {
    
    static def getKilometers(Measure self) {
        self.doubleValue(SI.KILO(SI.METER))
    }

    static def getMeters(Measure self) {
        self.doubleValue(SI.METER)
    }

    static def getCentimeters(Measure self) {
        self.doubleValue(SI.CENTI(SI.METER))
    }

    static def getNanometers(Measure self) {
        self.doubleValue(SI.NANO(SI.METER))
    }

    static def getMillimeters(Measure self) {
        self.doubleValue(SI.MILLI(SI.METER))
    }

    static def getMicrometers(Measure self) {
        self.doubleValue(SI.MICRO(SI.METER))
    }
    
    static def getMiles(Measure self) {
        self.doubleValue(NonSI.MILE)
    }
    
    static def getYards(Measure self) {
        self.doubleValue(NonSI.YARD)
    }

    static def getFeet(Measure self) {
        self.doubleValue(NonSI.FOOT)
    }

    static def getInches(Measure self) {
        self.doubleValue(NonSI.INCH)
    }

    static def plus(Measure self, Measure other) {
        // TODO there must be something in JScience to support adding Measures...
        def selfInMeters = self.doubleValue(SI.METER)
        def otherInMeters = other.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters + otherInMeters, SI.METER)
    }
    
    static def minus(Measure self, Measure other) {
        // TODO there must be something in JScience to support subtracting Measures...
        def selfInMeters = self.doubleValue(SI.METER)
        def otherInMeters = other.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters - otherInMeters, SI.METER)
    }
    
    static def multiply(Measure self, Number number) {
        def selfInMeters = self.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters * number, SI.METER)
    }
    
    static def div(Measure self, Number number) {
        def selfInMeters = self.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters / number, SI.METER)
    }
}
