package org.com.preparingOOD.structuralpatterns.decoratorpattern;

import java.util.ArrayList;
import java.util.Arrays;

public class CensorVowelsDecorator extends MessageDecorator{
    ArrayList<Character> vowels = new ArrayList<Character>(
            Arrays.asList('a', 'e', 'i', 'o', 'u'
            ,'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
            'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я',
            'А', 'Е', 'Є', 'И', 'І', 'Ї', 'О', 'У', 'Ю', 'Я'
            ));
    public CensorVowelsDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder(super.getContent());

        for (int i = 0; i < sb.length(); i++) {
            if (vowels.contains(sb.charAt(i))) {
                sb.setCharAt(i, '*');
            }
        }

       return sb.toString();
    }
}
