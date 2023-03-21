package LivroKotlin.Interface

import java.io.InputStream
import java.io.OutputStream

interface Document {
        val version: Long
        val size: Long
        val name: String
            get() = "noName"

        fun save(input: InputStream)
        fun load(stream: OutputStream)
        fun getDescription(): String{

            return "Document $name has $size byte(-s)"
        }


}