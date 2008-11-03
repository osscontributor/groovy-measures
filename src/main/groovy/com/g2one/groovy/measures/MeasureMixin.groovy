package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.SI

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
}