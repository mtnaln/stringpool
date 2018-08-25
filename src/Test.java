
/**
 *
 * Metin Alnıaçık, 25.08.2018
 * String pool
 *
 */

public class Test {

    public static void main(String[] args) {

        String name = "metin";
        String name2 = "metin";
        String name3 = new String("metin");
        String name4 = new String("metin");

        System.out.println("'name' ve 'name2' string poolda olduğu için true mesajı dönecektir. ==> " + (name == name2));
        System.out.println("'name' string poolda 'name3' ise string poolda değildir. Bundan dolayı sonuç false olacaktır. ==> " + (name == name3));
        System.out.println("'name3' ve 'name4' her ikisi de string poolda değildir. Bundan dolayı sonuç false olacaktır. ==> " + (name3 == name4));
    }
}
