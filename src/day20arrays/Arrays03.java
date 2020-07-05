package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// iki array oluşturup bu array'lerin birbirine eşit
		// olup olmadığını kontrol ediniz.
		// Not: ik arrayin eşit olabilmesi için
		// 	1) Elemanları aynı olmalı
		// 	2) eşit elemanların index'leri de eşit olmalı
		// {1,2,3} eşittir. ama {1,2,3} ile {1,3,2} eşit değildir.
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println(arr1==arr2); // false verir çünkü referenc'ları karşılaştırır.
		// "==" adresleride kontrol eder.
		// iki array farklı iki object olduğundan adresleride farklıdır.
		
		System.out.println(Arrays.equals(arr1, arr2)); // true verir çünkü 
		// Arrays.equal() methodu sadece değerleri ve indexleri kontrol eder
		// adreslere bakmaz.

	}

}
