package com.example.jsontoobject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper


class MainActivity : AppCompatActivity() {

    val objectMapper = ObjectMapper()
    val jsonPerson = "{\n" +
            " \"name\" : \"Anıl\",\n" +
            " \"surname\" : \"Dinç\",\n" +
            " \"age\" : 30\n" +
            " \"isWork\" : false\n" +
            "}";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        objectToJsonWithJackson()
        jsonToObjectWithJackson()
    }

    fun objectToJsonWithJackson() {
        val person = Person("Erkut", "Dinc", 23, false)
        var jsonPerson = objectMapper.writeValueAsString(person)
        Log.i("Json", jsonPerson)
    }

    fun jsonToObjectWithJackson() {
        try {
            val objectPerson = objectMapper.readValue(jsonPerson, Person::class.java)
            Log.i("name", "Name: ${objectPerson.name}")
            Log.i("surname", "Surname: ${objectPerson.surname}")
            Log.i("age", "Age: ${objectPerson.age}")
            Log.i("isWork", "Is Work: ${objectPerson.isWork}")
        } catch (e: JsonProcessingException) {
            e.printStackTrace()
        }
    }

}