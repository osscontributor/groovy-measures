package com.g2one.groovy.measures

import javax.measure.Measure

class GroovyMeasures {

    static {
        Number.mixin NumberMixin
        Measure.mixin MeasureMixin
    }
}