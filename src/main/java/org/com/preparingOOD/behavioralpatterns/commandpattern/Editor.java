package org.com.preparingOOD.behavioralpatterns.commandpattern;

public class Editor {
    private StringBuilder text = new StringBuilder();
    private String clipboard = "";

    public void append(String str) {
        text.append(str);
        System.out.println("Додано: " + str);
    }

    public String delete(int start, int end) {
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Не правильні границі для delete");
            return "";
        }
        String deleted = text.substring(start, end);
        text.delete(start, end);
        System.out.println("Видалено: " + deleted);
        return deleted;
    }

    public void copy(int start, int end) {
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Не правильні границі для delete");
            clipboard = "";
            return;
        }
        clipboard = text.substring(start, end);
        System.out.println("Скопійовано: " + clipboard);
    }

    public void paste(int position) {
        if (clipboard.isEmpty()) {
            System.out.println("Буфер обміну пустий");
            return;
        }
        if (position < 0 || position > text.length()) {
            System.out.println("Не правильна позиція для paste");
            return;
        }
        text.insert(position, clipboard);
        System.out.println("Вставлено: " + clipboard);
    }

    public String toUpperCase(int start, int end) {
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Не правильна границя для toUpperCase");
            return "";
        }
        String original = text.substring(start, end);
        String upper = original.toUpperCase();
        text.replace(start, end, upper);
        System.out.println("Фрагмент у верхньому регістрі: " + upper);
        return original;
    }

    public String toLowerCase(int start, int end) {
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Не правильна границя для toLowerCase");
            return "";
        }
        String original = text.substring(start, end);
        String lower = original.toLowerCase();
        text.replace(start, end, lower);
        System.out.println("Фрагмент в нижньому регістрі: " + lower);
        return original;
    }

    public String getText() {
        return text.toString();
    }

    public int length() {
        return text.length();
    }

    public String getClipboard() {
        return clipboard;
    }
}
