package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.SI

class NumberMixin {

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

}
