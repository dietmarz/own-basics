package de.ztronics.de.ztronics.basic.idioms

class FunctionalFunctions {
    fun <T> Collection<T>.filter_(body: (T) -> Boolean): List<T> {
        val result = mutableListOf<T>()
        for (item in this) {
            if (body(item)) {
                result.add(item)
            }
        }
        return result.toList()
    }


    fun <T,V> Collection<T>.map_(body: (T) -> V): List<V> {
        val result = mutableListOf<V>()
        for(item in this) {
            result.add(body(item))
        }
        return result.toList()
    }

}

