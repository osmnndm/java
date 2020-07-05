package day35collections;

public class Set01 {
	
	// Set interface'i duplication'a(tekrarlı elemanlara) müsaade etmez.
	// Set içinde aynı elemandan iki tane olamaz.
	// Set'i tekrarlı eleman bulunmasını istemediğimiz zaman kullanırız.
	// HashSet, LinkedHashSet ve TreeSet Class'ları Set interface'inin childleridir ve 
	// Set'te tekrarlı elemanlar kullanılamadığından dolayı bu Class'lardada hiç bir surette
	// bu Class'larda tekrarıl eleman olmaz. Set gördüğümüzde no dublication diye düşünübeliriz.
	// TreeSet aynı zamanda SortedSet interface'inin child'didir. SortedSet interface'inin 
	// özelliği elemanlarının sıralanmış olmasıdır. TreeSet bu interface'in child'i olduğundan
	// inheritence'dan(miras) dolayı aynı özellik TreeSet Class'ında da mevcuttur.
	// hem tekrarlı olmasın, hemde sıralı olsun istiyorsak TreeSet Class'ını kullanırız.
	
	// 3 tane bilmemiz gereken Set var.
	// 1) HaschSet(No dublication) 2) LinkedHashSet(No dublication) 3) TreeSet(No dublication+Sorted)
	

}
