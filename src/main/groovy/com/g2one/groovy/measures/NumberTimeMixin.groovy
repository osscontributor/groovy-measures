package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.NonSI


public class NumberTimeMixin {

    static getDays(Number self) {
        Measure.valueOf(self, NonSI.DAY)
    }

    static getHours(Number self) {
        Measure.valueOf(self, NonSI.HOUR)
    }

    static getMinutes(Number self) {
        Measure.valueOf(self, NonSI.MINUTE)
    }

    static getSeconds(Number self) {
        Measure.valueOf(self / 60, NonSI.MINUTE)
    }

    static getMilliseconds(Number self) {
        Measure.valueOf(self / 60000, NonSI.MINUTE)
    }

}