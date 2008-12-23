package com.g2one.groovy.measures

import javax.measure.Measure

class GroovyMeasures {

    static {
        Number.mixin NumberDistanceMixin
        Number.mixin NumberTimeMixin
        Measure.mixin MeasureDistanceMixin
        Measure.mixin MeasureTimeMixin
    }
}
