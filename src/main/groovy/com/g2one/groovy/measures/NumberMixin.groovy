package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.SI

class NumberMixin {

    
    static def getMeters(Number self) {
        Measure.valueOf(self, SI.METER)
    }
    
    static def getKilometers(Number self) {
        Measure.valueOf(self, SI.KILO(SI.METER))
    }

    static def getCentimeters(Number self) {
        Measure.valueOf(self, SI.CENTI(SI.METER))
    }

}
