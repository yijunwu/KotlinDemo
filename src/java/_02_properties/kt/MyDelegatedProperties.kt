package _02_properties.kt

import kotlin.reflect.KProperty

var p1 by Prop("initial")
var p2 by Prop("initial")
var p3 by Prop("initial")

class Prop(var field: String) {
    operator fun getValue(thisRef: Any?, p: KProperty<*>): String {
        println("You read me")
        return field
    }

    operator fun setValue(thisRef: Any?, p: KProperty<*>, v: String) {
        println("You write me")
        field = v
    }
}