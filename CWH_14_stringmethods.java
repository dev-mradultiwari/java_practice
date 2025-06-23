package com.company;

public class CWH_14_stringmethods {
    public static void main(String[] args) {
        String name = "     Mradul Tiwari      ";

       // System.out.println(name);
        int value = name.length();
        System.out.println("(a)   " + value);

        String lstring = name.toLowerCase();
        System.out.println("(b) " + lstring);

        System.out.println("(c) " +name.toUpperCase());

        String trim = name.trim();
        System.out.println("(d) " +trim);

        String newstr = "Mradul Tiwari";
        System.out.println("(e-1) " +newstr.substring(3)); //int start index only
        System.out.println("(e-2) " +newstr.substring(1, 8));  //int start and end index both - note that index start from zero and starting index will be included but end index is excluded

        System.out.println("(f) " +newstr.replace("a", "b"));

        System.out.println("(g) " +newstr.startsWith("Mr"));

        System.out.println("(h) " +newstr.endsWith("I")); //its case sensitive if our words end with i in lower case then it will show false if we use I in ends with

        System.out.println("(i) " +newstr.charAt(0)); //returns index

        System.out.println("(j-1) " +newstr.indexOf("i"));
        System.out.println("(j-2) " +newstr.indexOf("ra"));

        System.out.println("(k-1) " +newstr.indexOf("i", 9));
        System.out.println("(k-2) " +newstr.indexOf("i", 8)); // in newstr.indexof if we choose from index then it will search from that index number to the end nut if we use from index in lastindexof then it will search till the number entered from the stating


        System.out.println("(l-1) " +newstr.lastIndexOf("a"));
        System.out.println("(l-2) " +newstr.lastIndexOf("a", 9 ));

        System.out.println("(m-1) " +newstr.equals("Mradul"));
        System.out.println("(m-2) " +newstr.equals("Mradul Tiwari")); //case sensitive

        System.out.println("(n) " +newstr.equalsIgnoreCase("mradul tiwAri")); //ignores case









    }
}
