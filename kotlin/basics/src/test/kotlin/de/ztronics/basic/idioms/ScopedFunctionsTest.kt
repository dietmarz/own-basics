package de.ztronics.basic.idioms

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.fail
import org.mockito.kotlin.mock
import org.junit.jupiter.api.Test
import org.mockito.kotlin.verify
import kotlin.test.assertEquals

import kotlin.test.fail


class ScopedFunctionsTest {






    // Erstelle ein Benutzerobjekt und initialisiere es mit Werten. Verwende also, um das Objekt zu loggen oder
    // zusätzliche Aktionen auszuführen, wie das Hinzufügen des Benutzers zu einer Datenbank, direkt nach der Initialisierung.
    @Test
    fun `my also test`() {
        data class Person(val name:String, val age :Int, val callback: () -> Unit) {
            init {
                callback()
            }
        }

        var isCalled = false;
        fun checkCall() : Unit{
            isCalled = true
        }

        assertFalse(isCalled)
        val p1 =  Person("Hans", 45, { checkCall() }).also {
            print("Person ${it.name} erzeugt ")
        }
        assertTrue(isCalled)


         val mockCallback = mock< ()->Unit >()
         val p2 = Person("Hans", 45, { mockCallback() })
          verify(mockCallback).invoke()

    }





    //Schreibe eine Funktion, die eine Liste von Zahlen nimmt und nur die Zahlen druckt, die größer als ein bestimmtes Minimum sind. Verwende let, um eine Bedingung zu prüfen, bevor du etwas ausgibst.
    @Test
    fun `my let test`() {
        fun <T:Number> printBiggerThan(minimum: T, list :List<T>) :List<T>{
            val tempList = mutableListOf<T>()
            // Könnte man besser mit filter machen, da forEach void retuned
            list.forEach {zahl ->
                zahl.takeIf { it.toDouble() < minimum.toDouble() }?.let {// toDouble :-(
                    tempList.add(it)
                }
            }

            return tempList
        }
        val filtered = printBiggerThan(12, listOf(10, 11, 12, 13, 14))
        assertEquals(listOf(10,11), filtered)
    }



    @Test
    fun `my test`() {
        val result = "Hello".let {
            assertEquals("Hello", it)
            it.length  // Der Rückgabewert des Blocks
        }
        assertEquals(5, result)

        val list = ArrayList<String>().apply {
            add("One")
            add("Two")
        }
        assertEquals(2, list.size)

    }




}