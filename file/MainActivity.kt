package com.lee.file

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dir= filesDir.absolutePath
        val filename = "first.txt"
        val contents = "파일 내용 쓰기\n01. 안녕하세요\n02. 두 번째 줄입니다."

       // writeTextFile(dir,filename ,contents)
        val result = readTextFile(dir + "/"+filename)

        Log.d("파일내용",result)
    }

    fun readTextFile(fullPath:String):String{
        val file = File(fullPath)
        if(!file.exists()) return ""

        val reader = FileReader(file)
        val buffer = BufferedReader(reader)

        var temp:String? = ""
        val result = StringBuffer()

        while(true){
            temp = buffer.readLine() // 줄단위로 읽어서 임시 저장
            if(temp==null) break
            else result.append(temp).append("\n")
        }
        buffer.close()
        return result.toString()
    }

    fun writeTextFile(directory:String,filename:String,content:String){

        val dir = File(directory)

        if(!dir.exists()){
            dir.mkdirs()

        }
        val fullPath = "$directory/$filename"
        val writer = FileWriter(fullPath)
        val buffer = BufferedWriter(writer)

        buffer.write(content)
        buffer.close()

    }
}