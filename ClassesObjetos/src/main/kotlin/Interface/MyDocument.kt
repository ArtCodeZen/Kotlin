package Interface

import java.io.InputStream
import java.io.OutputStream

class MyDocument : Document{
    override var size: Long = 0
        get() = 0

    override fun load(stream: OutputStream) {
        println("load")
    }

    override fun save(input: InputStream) {
        println("save")
    }

    override val version: Long
        get() = 0

}