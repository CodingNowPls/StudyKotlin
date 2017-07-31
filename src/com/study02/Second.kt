package com.study02


/**
 *  说明： ${DESCRIPTION}
 * @author StriverFeng
 * @create 2017-07-31 22:56
 **/

fun main(args:Array<String>){
    if (args.size==0){
        print("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")


}