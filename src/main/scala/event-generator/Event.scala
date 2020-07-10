package event.generator

import java.sql.Timestamp


case class Event(val region: String, val level: Int, val idAddress: String, val eventTime: Timestamp)