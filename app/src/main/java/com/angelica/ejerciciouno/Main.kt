package com.angelica.ejerciciouno

fun main(){

    //crear objeto

    val operaciones: Operaciones
    operaciones = Operaciones(25, 35, 16)

    //llamar clases

    operaciones.suma()
    operaciones.resta()
    operaciones.multiplicacion()
    operaciones.division()
}
//Crear clase
class Operaciones (val A:Int, val B:Int, val C:Int){

    //Crear funciones
    fun suma(){
        val resultado = A + B + C
        println("El resultado es: $resultado")
        //println(A + B + C)
    }
    fun resta(){
        val resultado = A - B -  C
        println("El resultado es: $resultado")
       //println(A - B - C)
    }
    fun multiplicacion(){
        val resultado = A * B * C
        println("El resultado es: $resultado")
        //println(A * B * C)
    }
    fun division(){
        val resultado = A / B / C
        println("El resultado es: $resultado")
    }
}