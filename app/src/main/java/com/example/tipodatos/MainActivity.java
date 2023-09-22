package com.example.tipodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definición de una variable
        //int x,y,z;
        int x;
        int y;
        int z;
        //Declaración
        x=5;
        y=6;
        z=-128;

        //Tipos Datos
        //Texto
        String texto= "Hola Mundo";
        char caracter= '@';
        //Númericos
        byte enteroByte= 12;//-128 a 127
        short enteroShort= 32500;
        int enteroInt= 1111111111;//Comun de usar
        long enteroLong= 1000000000000000000l;//L o l -->long

        float decimalFloat= 2.5555f;//F o f --> float 32 bit
        double decimalDouble= 2.5555555555555555555555555555; //64 bit

        boolean variableBoolean= true; //true o false

        //Imprimir
        //Java
        System.out.println(enteroInt);
        //Android
        Log.i("String",texto);

        //Operaciones que podemos realizar con variables
        //Númericos
        int valor1= 20;
        int valor2=50;
        int valor3=32;
        int valor4=65;
        double decimal1= 55.5;
        double decimal2= 100.666668;

        // +  -  *
        int multiplicacion= valor1*valor2*valor3;
        int suma= valor4+valor2;
        int resta= valor3-valor4;
        double multiplicacionDecimal= decimal1*decimal2;
        double sumaDecimal= decimal1+decimal2+valor4;
        double restaDecimal= decimal1-valor3;

        System.out.println(multiplicacionDecimal);
        System.out.println(multiplicacion);
        System.out.println(suma);
        System.out.println(restaDecimal);

        // división se divide en 2 partes en cociente(/) y residuo(%) cuando son números enteros
        double division= valor2/valor1;
        double residuo= 5%2;
        // Cuando se realizar divisiones con números decimales la división se realiza completa
        double division2= decimal2/decimal1;
        double division1= valor1/decimal1;

        double formula= (2+5)*8+(3-2)*14+(6+8)/14+5^4;
        /* 7*8+1*14+14/14+625
        *  56+14+1+625
        *  71+625
        *  696
        * */
        System.out.println(formula);

        //Operacione de cambio de tipo de dato
        //De cualquier tipo de dato a String
        String stringEntero= valor1+"";//"20"
        String stringEntero2= String.valueOf(valor1);//"20"
        String stringDecimales= decimal1+"";//"55.5"
        String stringDecimales2= String.valueOf(decimal1);//"55.5"
        String stringBoolean= true+"";// "true"
        String stringBoolean1= String.valueOf(false);//"false"
        String stringChar= 'a'+"";//"a"
        String stringChar1= String.valueOf('a');//"a"

        //de cualquier tipo de dato a entero int
        int intString= Integer.parseInt("55");//Que si en el String llega un valor diferente a numerico da error
        int intDouble= (int)decimal1;//55 y el .5 se pierde
        int intChar= (int)'@';
        char a= (char) 93;
        //De cualquier tipo de dato a double
        double doubleString= Double.parseDouble("5.55");
        double doubleInt= valor1;//20.0



        System.out.println(intChar);




    }
}