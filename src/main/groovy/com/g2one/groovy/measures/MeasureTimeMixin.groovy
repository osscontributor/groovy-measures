package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.NonSI


public class MeasureTimeMixin {

  static getMilliseconds(Measure self) {
      self.doubleValue(NonSI.MINUTE) * 60000
  }

  static getSeconds(Measure self) {
      self.doubleValue(NonSI.MINUTE) * 60
  }

  static getMinutes(Measure self) {
      self.doubleValue(NonSI.MINUTE)
  }

  static getHours(Measure self) {
      self.doubleValue(NonSI.HOUR)
  }

  static getDays(Measure self) {
      self.doubleValue(NonSI.DAY)
  }

}