package com.lambdaschool.httpoperations.retrofit

import com.lambdaschool.httpoperations.model.*
import com.squareup.moshi.ToJson
import com.squareup.moshi.FromJson



// TODO 12: Write type adapter for subclasses

internal class EmployeeTypeAdapter {
    @FromJson
    fun employeeFromJson(employeeJson: EmployeeJson): Employee {

        return when (employeeJson.title) {
        "Engineer" -> Engineer(employeeJson.name, employeeJson.id,employeeJson.age,employeeJson.title)
            "Tester" -> Tester(employeeJson.name, employeeJson.id,employeeJson.age,employeeJson.title)
            "Officer" -> Officer(employeeJson.name, employeeJson.id,employeeJson.age,employeeJson.title)
            else -> Employee(employeeJson.name,employeeJson.id,employeeJson.age,employeeJson.title)

        }
    }
    }

/*
    @ToJson
    fun eventToJson(event: Event): EventJson {
        val json = EventJson()
        json.title = event.title
        json.begin_date = event.beginDateAndTime.substring(0, 8)
        json.begin_time = event.beginDateAndTime.substring(9, 14)
        return json
    }
}*/
