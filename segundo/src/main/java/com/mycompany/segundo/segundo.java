/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundo;

Public class DateTest
{
public static void main(String[] args) {
      Date d = new Date();
System.out.printf("Tiempo EPOCH: %d\n", d.getTime());
System.out.printf("Equivale a: %s\n", d.toString());
GregorianCalendar gc = new GregorianCalendar();
gc.setTime(d);
System.out.printf("La fecha actual es: %d/%d/%d",
gc.get(GregorianCalendar.DAY_OF_MONTH),
gc.get(GregorianCalendar.MONTH) + 1,
gc.get(GregorianCalendar.YEAR));
}
}
