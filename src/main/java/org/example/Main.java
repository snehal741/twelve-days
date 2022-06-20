package org.example;


public class Main
{
    public static void main(String[] args) {
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] gifts = {" a Partridge in a Pear Tree.", " two Turtle Doves,", " three French Hens,", " four Calling Birds,", " five Gold Rings,", " six Geese-a-Laying,", " seven Swans-a-Swimming,", " eight Maids-a-Milking,", " nine Ladies Dancing,", " ten Lords-a-Leaping,", " eleven Pipers Piping,", " twelve Drummers Drumming,"};
        System.out.println("On the first day of Christmas my true love gave to me:" + gifts[0]);
        for(int i = 1; i < 12; ++i){
            String text = "On the " + days[i] + " day of Christmas my true love gave to me:";
            for(int j = i; j > 0; --j){
                text += gifts[j];
            }
            text += " and " + gifts[0];
            System.out.println(text);
        }
    }
}