package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    MyDb.myPersons.add(Person(R.drawable.mo,"Salah","Zag"))
    MyDb.myPersons.add(Person(R.drawable.mess,"Messi ","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.mo,"Salah ","Zag"))
    MyDb.myPersons.add(Person(R.drawable.ro,"Rolando ","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.mo,"Salah ","Zag"))
    MyDb.myPersons.add(Person(R.drawable.mess,"messi ","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.mo,"MO    ","Zag"))
    MyDb.myPersons.add(Person(R.drawable.mess,"Messi ","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.ro,"Rolando    ","Zag"))
    MyDb.myPersons.add(Person(R.drawable.mo,"Salah ","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.mess,"Messi ","Zag"))
    MyDb.myPersons.add(Person(R.drawable.ro,"Rolando","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.mo,"Salah","Zag"))
    MyDb.myPersons.add(Person(R.drawable.mess,"Messi","Egypt"))
    MyDb.myPersons.add(Person(R.drawable.ro,"Rolando  ","ZAg"))
    var rec= findViewById<RecyclerView>(R.id.rec)
    var m =myAdapter(MyDb.myPersons)
    rec.adapter = m
    rec.adapter= myAdapter(MyDb.myPersons)

}}